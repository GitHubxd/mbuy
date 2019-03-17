/**
 * 
 */
package com.mbuy.resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.mbuy.utils.CommonResponse;
import com.mbuy.utils.FileUtils;

/**
 * @author 37523
 *
 */

@RestController
@RequestMapping("mbuy/upload")
public class FileUploadResource {
	
	@RequestMapping(value="/batch", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public CommonResponse updateSingleFile(MultipartHttpServletRequest req) {
		String filePath = FileUtils.multiFile(req.getFiles("file"));
		CommonResponse commonResponse = CommonResponse.getInstance();
		Map<String, Object> res = new HashMap<String, Object>();
		commonResponse.setResult(filePath);
		return commonResponse;
	}
}
