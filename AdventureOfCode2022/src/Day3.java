 import java.util.Arrays;
 import java.util.Scanner;
 import java.util.*;
public class Day3 {

	public static void main(String[] args) {

		String input = "vvMQnwwvrwWNfrtZJfppmSfJSmSg\n"
				+ "BzGqjlBqBBmztHNFzDHg\n"
				+ "llRCPlTPPqBjPhqhlBRBClhqWcTWrWNcMbQbdrdLccccrnvM\n"
				+ "wMhwbTWpQjbpWHMQppzTHhjtlCjPSSJCCtlqRlJVFJFt\n"
				+ "ggdvvnvDgdDmNcBrrcDntFRFqHJJtSJqvlVSRlJq\n"
				+ "fggNNffGmcBrmBfcDzzzpHbsGTpszwwTbp\n"
				+ "BPdPPBggrPtrpbtvPBBdgrFmhhQThGGlbbTZnzZQzZfn\n"
				+ "ccjWRJVNcTGmnWWFmh\n"
				+ "DMNmsMHwRNBrggdPDPdt\n"
				+ "TfsfHLQbBtBFQbQsBmPwwlnPGZFwwdwWFZZw\n"
				+ "MRpcvJMJVSMrVMpVSvhhnclwgWwDZgWgWgWglwcG\n"
				+ "GCzjRJjVjSSrvfNQtLmQNsQbjB\n"
				+ "FrSPFjtVvwsqSwcG\n"
				+ "hDHdWDngpgZTDgHzzHwNNqlwNvZJlGqcQGsl\n"
				+ "wDzLTDHgFffLtRft\n"
				+ "CnCJNVqvCBJBNZmfPcPMcFLVcwmd\n"
				+ "HgzjHFghSFtrLfwPchPM\n"
				+ "QDpjgDSQlHHlDQQRzRzsBRRvWnWvJvZnqWBJNF\n"
				+ "mGHcFPFqzPtcfPwDGVVpgLgSlgBl\n"
				+ "rCvddTrnsbDLVSDwjSjd\n"
				+ "QWhWQThswssMQMMMvhTzPqJzmzftHccJfHFhFm\n"
				+ "cPbNpLVFTPbbFrpTLQBzqqmgnnBhgLMM\n"
				+ "vvSwWCZCRZCDZtGwzdgWdQmzqgnQddJn\n"
				+ "vCltGltCGmRRmCvDjjtHFpbcFfbbfssbpNPpHFpH\n"
				+ "WLLQMWZLSPMPWmrwhnjhZZhpHJHljBDB\n"
				+ "csbtCfFgCftGljHwHcBnpnJR\n"
				+ "tsvgszNtfMwPzWqPrS\n"
				+ "NbDZrbrFQQqqQtQqQDtTcBvCLBLswsZhscCGBZ\n"
				+ "ljmWRzVRpbndMWmmfdsTsCBsGwTVVVCGCGws\n"
				+ "ffRpnllHRMfdWzdnmRNQNNSFQQFNbrFHHrNH\n"
				+ "LccGzWNjcvNLGTmHNsNLMlMwMpMPGlMCwFwDDGCw\n"
				+ "fZZtfrZgrfQSnnnSnJRCglHpCwwHwpglDClFMw\n"
				+ "SqJQnffJRnfQQVRhrQtrhnThcLhzNzHdTjhsTWzjdmcm\n"
				+ "QJQwJMSbtbRgMQMQVZpCZsrrhpZBwrLLvs\n"
				+ "qCNPGWdqhpphsWrB\n"
				+ "DcNPNnqjdGDqjmPGGJRFMQmgtlQmQJCSgb\n"
				+ "blTRbDnHRGGBwnGPCtFPWzVCDvFWtL\n"
				+ "pdSJprqhhZSdqSdZNhVzZWtzLVgVPvzjLzWv\n"
				+ "rrsqsmrMpPHlwTsRHn\n"
				+ "mbNhgbRSLmTwswFm\n"
				+ "vHjHBWMHBzMqWZVZBzHzcwwwdcFLcpLspdzwpwQd\n"
				+ "HfMWMfvjWtZHqWDlhSnnnJNnbhslDb\n"
				+ "lwsvPPnqlwwwsPcHTgqcRcSccmgQ\n"
				+ "CVWBWCFpFzWfFjWjhNSQJJmcVcHRZJNTSc\n"
				+ "zdhfzBtfLLtfFClbrDvsPvtPbnmv\n"
				+ "PntVQbDnQHcDVvhtbtDhcbPcFTrrNfjqmmPTTZqMLZZMjFZm\n"
				+ "lgJCpCFCSCGCpllWMfZqTNNZrMjrJTTM\n"
				+ "CSzSwgFlzsGBzQcQhsnnDbVdtc\n"
				+ "THzqvrVrWzhqhWwqhTbNNDRtFRmmpFDDVsFLLsdddF\n"
				+ "MbZSSScZSGCJCjZlCjdPmpRmFLDtctdmFRsp\n"
				+ "GfJQlnZjSMnllbJCQbClnZQrhNwwqhBzTNhrffqhqWhTqz\n"
				+ "BdBdmDZHFFbrHHStPSRtPCzSRNDS\n"
				+ "JGGpwqLJGMTLpLlMpqLhJtzCCSGQSPzNNczVVPVzSV\n"
				+ "WwpllfslqfhffLwhfJpJlqlwdBmZnrdFHBFBBmNHFsFmdZmn\n"
				+ "jZfQZnZfnbRfjCnfbSSmVpqmNmVpCqlhCqqPpP\n"
				+ "MdJMwMvvLDssLtFMsMtLDsvvDRmmmPhWzWzphpmqDVzPDWNp\n"
				+ "TsLdMrvRtLJtGdtGRRtFTBjSBrScnSZjnbcgQgHfnB\n"
				+ "RZfmlRlWJmWLLRscrslJqvvMdVwmddvPddQPVDdDwz\n"
				+ "GStFbFCbntbjNnjFhFvdHfhzHfzzQdMHwPdD\n"
				+ "BSGpFbbjbNjnNNFSbRsLlWqgrZrfRgsBlg\n"
				+ "ztHczmrmcNNzHsPSTwsPHSQPQT\n"
				+ "CFCRjlvbClCjBdPDFQdwBsqn\n"
				+ "llbRgjClJCVVMMCssfmNZWszrNgzGL\n"
				+ "mmFldllVlmtdWFvPPFBcSSBW\n"
				+ "DZzZGzZswQZHwQZjZzWWTSSvjSdvPvvWjJTS\n"
				+ "DpQQggwzZGdmbCldgVgf\n"
				+ "PJJvhqzVGbTFqzqbbGTlLmrtrZMnnZnntlJnrD\n"
				+ "fNwRcQBCRNddNgLtgDnttqrMMtlr\n"
				+ "RfRdNWQHcqHscdfRdGPFbFPpvpVWWzPzVS\n"
				+ "DRgjZRRDggTfjfRvwWzHGGHPWDswvv\n"
				+ "dhbmpcCmchgCpsGzWPdVGvWHwP\n"
				+ "hpMMMpCQMnChFgNRQffTRrSN\n"
				+ "gfqPCHWtPMMjCtffgjQWGLvGdZcdLLGZcLFGZBWG\n"
				+ "pJTDsnnnvBjnFwvj\n"
				+ "zJRpTbNrTSppRVblgbljMgMfCfbC\n"
				+ "fGrGwqggtbVmtzbf\n"
				+ "CTMjNQcJjJTBNCjMNZFNBcCZHbmWZHVLZDDWVtDzzbVmlV\n"
				+ "hMvTcNMFMhQjTTBFBNMhwpspwgnGtvtnSgdwrRpG\n"
				+ "RfFdqPdMMGPVgWmNVN\n"
				+ "QwrTsbnSsSQpwlSSbNNWDmGLVjjmLWwNVB\n"
				+ "rpcclTCprmZQSbprSTpRRRfqMfHHCHfhMhvFJM\n"
				+ "LnJJsMtLbzsPPVPJbrTBlTWlfRfqnTrrlr\n"
				+ "VDHVQNFGgNTrSjSBjq\n"
				+ "CHFHGmvDGdZZGCQZVDgDHVbwLLwtMwwmJLJbLPPMbczt\n"
				+ "qNNNBllFBzFjjzwGqGgLrWgrtQjdmmtQmQpp\n"
				+ "ZMHJCPhMZRsRCsCPsSJZLmQdQgrtQwQwQZwdWg\n"
				+ "CnMPbbRbsPhCnbfhMPRPllnFGqwTTFzTzNvBGBGc\n"
				+ "wZWlBFZQgBzTzpZwBlVpzWBWnNMmnMvMcMJMmLGnVmqLqGMq\n"
				+ "PdSDfJbCHsHHdJjsRRhjjPjmLqnnrLMLcrnLvdLMNccvGn\n"
				+ "tSJtSCtbJhDhtzlFQZlTZTFp\n"
				+ "TNqZDqmMDZNMFSGHjSGBRBdN\n"
				+ "CrrwVwsPjjBHddPf\n"
				+ "rpWggQVspQWcgtLwcHZZzDDMLDvvnnMzDM\n"
				+ "lWrWmPwmGlZwZjdLZLzV\n"
				+ "cFcDJhJnmqBqDCRpZzVLNsFLjLzdds\n"
				+ "qJchTDCBHDWglmrfWPHH\n"
				+ "RgLRnTJWnfHDcQQBfg\n"
				+ "bZpNwdwbdMvVPsHHJMQfSSfP\n"
				+ "mVbdNNdrbCzZbdZvbWTGrhqjTJtRWttRjq\n"
				+ "TMtqqBJLrwqrZPlHHGhGnlBhzv\n"
				+ "bFgNcpDRnpgggjCzvWDWhQhQWQHHvz\n"
				+ "jnnVgjcgcTZMJqJVtT\n"
				+ "dVSjmdHrfGPddrQgstFgzsQfsMFQ\n"
				+ "hvJJCCJDcCtwBVFQzzBD\n"
				+ "RWCnTvWTLRnJJLJllWhTLSprVdNZVGHGNGGnrdGSZH\n"
				+ "gvMSHFZtBBMBMFZHzjnqLsLGMCzRWWMn\n"
				+ "QJmDrhbNDbJfPQhDmQPRLszRlnjCzzWqrRnlsL\n"
				+ "PcJVhJbJJNcNDmfDmjJmbhTfBvpwVSdggtgvgSFZwgvtgpdZ\n"
				+ "PBClRHHClRlFljllZSBBBllppVGDLpZVVVsGpmGcNDpGLL\n"
				+ "MvNwnbMwccVsswDG\n"
				+ "MqnNbzMMrQfnqtttqfQWQQnRdCSHgHPglRFBRWlHjWRlCW\n"
				+ "lldwdfSBWphHBggZghFs\n"
				+ "DjDbDVRzDmLRzRLGJjPssrLZPhdshFHrssTZ\n"
				+ "mvddMzvmmDDvvwQqWftCfqWqfM\n"
				+ "gpTTwNWGWMSMgJjnvpvvJbJppn\n"
				+ "lQvmLFdfrQzRFctlrLdRLVPnhPPbVDPDfjnVbfhJjV\n"
				+ "FLFqccvmmtcQtrmQccRFLlRLSSWBSgTWNwsggqMBsqWGHMNG\n"
				+ "PjPtVQrPVjrVPLLDQVFLTTWWqbSZwRwzqwSbSbbbwFSq\n"
				+ "lBnGJBnfflRRNZwbqb\n"
				+ "HJMGgmfpRMHGGdgncJHLDjjtVDQctLCvQCjTtr\n"
				+ "VvmvjRGwRwvhmhRvvvVCCTTJjfWqfDMMcJlcCD\n"
				+ "NpNbPfpSnngZbbLMFJWTMlLFqJJDMD\n"
				+ "bNSfdSHQZgVQzwhhvRmQ\n"
				+ "MhmHcDhChhcPVMDPDPQdFhQHnbNpZbZnprnrmNnjNbsllbnp\n"
				+ "WWqGCWSCzsGbbGNgjN\n"
				+ "LzwqBLSvwJCLPVMVDLdhMP\n"
				+ "mNVLLffSLVWdZCcFZCZrSbGr\n"
				+ "glvcwszTlsRDrHQCZFCvGH\n"
				+ "gTBRlJnwhzgTgsTnggslsJRTpLNmjmNNcdVLdhfpLpdLVmLc\n"
				+ "pCgfDrDrgccfppmDnhHMGqGbpHHSqzGLlqHS\n"
				+ "tFtjQRPFFZRVNRcQGbLzLFMSGzSbWLqH\n"
				+ "QRNTZjvjTTwtwNfmcTgfnCgnnBhm\n"
				+ "hcPBhqPzqWPccHWHHWqnPdssPVfFFmZDnVDDms\n"
				+ "NSLNCTRQZndRmDfnRD\n"
				+ "QSGTGbjTSTJHBlbZZBbh\n"
				+ "dgcWgVgWdvZSbbRtjLRZZZ\n"
				+ "MMDPPfTnPTQrFDMpHzmmLztLnsszRtwbtS\n"
				+ "rDfDqfHTpCSJqlCCGq\n"
				+ "bjsgllstBbpNpslBpdBgqljgGwzJzDzwLGGrwLQQdJDwGhQh\n"
				+ "nncmnmHHnmWRWmPfJCnvPRMrzvDhZZLGQwhDLhhMzZZZ\n"
				+ "mffccVHRRPTTNlpNbNjJVslJ\n"
				+ "DgPstgPtgPNNcjQQrtPJJCRSZTwSGJZZCZCJGD\n"
				+ "dHVvpzdBBhVqzWqvhvHdzGSZlTRCSRJrwSSCwJCWGT\n"
				+ "zpvVVqMBrzqrhFBvjbNPcPLnjcQtMcnj\n"
				+ "gBcmTCFghhCCBnBhWWwFbwLdwHFMLMdp\n"
				+ "LVzlZzPPMMzWWrwH\n"
				+ "ljqjsGlZPPqqlVsPqDVqjQQctNTnRcNLtCNmmnRTRthBGG\n"
				+ "LPRrrBNNjLBRJNdrGPRBfBrLwFqmDbdbTbTgmmgwmttFwtmH\n"
				+ "QQcVvnQphlWsCQCCVpnvptTJgbtqwHDwbJtJHFsTHw\n"
				+ "ppcJVQvpvMVMCvQZQVVZCCSRZPSjNRRZBPPPPzLjSLGf\n"
				+ "MLtRnjQsRMJcDQJnSrsfqVVvGwbbbqgggg\n"
				+ "WBFCNlFFFhFBlCHbplFWdpWZfVqPPwqTGdqTGvwrPVvTqvTr\n"
				+ "HClCHzFzFBhmnjtQzMMSMnbD\n"
				+ "sVnMCsdlMRcMFBGz\n"
				+ "JvwwgrJDfgDmmggQrhNfhQQftjFrGRRtZFGBRZFHzjGcjrcj\n"
				+ "PBJJvgDPNllPddVCPl\n"
				+ "fmmRSnfnMnFSmMmmzTDSBFHtlJJqHJJqdHQdTCdtCCdt\n"
				+ "WggGpNVVgWdwwHQtlGlC\n"
				+ "hjbWppbLbLZLjVPPjPLSRRMvDlmSzDzBSnBFZf\n"
				+ "nVttMPnPLjnJLjcnPVCjJJLcssfggBNlffgcNsWTcGcgNsBF\n"
				+ "HQbwhmDrRrgFsWlQGNls\n"
				+ "pZdbGzGrGpVttPLttv\n"
				+ "LLbMrMHLDdWhmgbqqt\n"
				+ "jGSQZQTpQGVVRSlQMQRljZmgmJBSvggvBWhJmJWvddmt\n"
				+ "VjlQFGMVrFFrDrPw\n"
				+ "DZVDwGZlJlVlwZVDzNdqfjMDnjqzNnWf\n"
				+ "pmtpLRQFhSFpmpRgRtHNFznNdqWBjzWfnBjMWf\n"
				+ "rHRrhStppHdJcGJrrssCsV\n"
				+ "pgQqHwgPcPCddCjdWtdp\n"
				+ "VfZGVFfNVhZhzjjjLz\n"
				+ "fNNBBnGVNfBfRSRjBRQHJQTwJcJTgHPwTngr\n"
				+ "MZdlzWzthMgrwmGmqZNqNs\n"
				+ "VvJQJPVDBJQThwwNsRqsvRsHHm\n"
				+ "BDQQPTnDDBQQBVfTBQPdFctzzdtztMMtnhcWcd\n"
				+ "LjWjDShflZRRcZzfHH\n"
				+ "srNwQPBsrVRhNmRGHzmM\n"
				+ "rBdgQTrhdPndQTrsQQsrPwnTpLLCWDpSCLtCnvtSWpJjDCvl\n"
				+ "gSlvDwCvcmcTQTFtRMjWHFVVHwtj\n"
				+ "rbsphZZzBshGZssMffTVRFfFpWpfTH\n"
				+ "GZNhZBhPBzTPNLDcDlCDCJNmlg\n"
				+ "smZjGfvjbWWffQtf\n"
				+ "dwRrdlVdDdgDbNtgcgQSNStQ\n"
				+ "FdFVwdblFlzVrlwrTlndZHHZGhmLhhssjHhMjnjq\n"
				+ "QFvQVFLLgVrFLBVgGhTtllPvmHRRGbTm\n"
				+ "hDCCNCNCJNzWDZnqJDzSNCTnbRttHGRnccbPRtmmlmHc\n"
				+ "qJshNMCNdVFVfsLB\n"
				+ "FcLZZPFjdZcZMPcRjcRTgbpJlwbbTlmdTlGlwD\n"
				+ "nrrNrHWBNSWvBqvvrhBqzStrgGnnmbwsbbJbwwJnmwmgJTlD\n"
				+ "BCrrNvqWvSQPcCGZZRQQ\n"
				+ "vPwcJblJzJbJcJFcwBSvJNdWRLtdsddGWWddWRWsMF\n"
				+ "mDZmmDZDHVhfmjZgjVDfhTZHtsNptRsMntnWdsMnGtRntG\n"
				+ "mhQrQDDhgqTTNfhmVQVBrPlBczSJbbCbCCPPvb\n"
				+ "ZjbjLlbZjGqsgJTfHggrVvlB\n"
				+ "tFDRFRnMFnnWtDdMdDRhzHfTJhJhffHvHTBHTgcfJV\n"
				+ "nztDtdWzCCMSptSdFRRswZjsLbjwZmwqwGqpQV\n"
				+ "vnvmmVnmVbrBJlzgWQWVNFzNHV\n"
				+ "MwSjZhSwPjMwfDRzgWlNpWvHlgNNNP\n"
				+ "CfSZjSfftwZDChDRSnccnrvBbbGrtBvctr\n"
				+ "LCBRQRBQwRrCVLVWSrCSwCptzvhthvGGhdHzwppTTddv\n"
				+ "mFnJJmnmFFFfPLNNmqqNJDpGnGtbHTtHvhnHbzvHvpGv\n"
				+ "lMMPLqDmNMVSjjgMCS\n"
				+ "zzPzbLjHLjfQPQHwwjddFNsNSJjDMsdNMFsC\n"
				+ "BqqtmgDhcqdSFCdsqddF\n"
				+ "GtcmrvhgcZlvZtBhtVgrvrvtnWzDnQbfnwlfWWRHWbbwzHRL\n"
				+ "JfWHWZcMMdDLMPjRnCJjRbFgnblF\n"
				+ "ShtBTSmBhTtqtfmqSTNvmjVjnFbFnnlrlqgCnrFnVg\n"
				+ "vfzTTthppmdzPLHLWdGZ\n"
				+ "tdvrvGgGTSScnHcjcg\n"
				+ "zLLVfzPPcDZnPjSPpD\n"
				+ "LfffNFLNlNbJwrctthWqNdNq\n"
				+ "NdjJtfVNZnnFFdtfGfFNcvpbMDbzdcTbbzpvmcDR\n"
				+ "PHMSHCHHWrRCvzDzDChT\n"
				+ "BqPWSHwllSQWrLHQHPqlBBNfttZMjFQfjGtZtNjJJjnN\n"
				+ "CpZtMCMQQpCVWjMDVjPVQsWWqJJhbTcddPlfhTRqchcJblhh\n"
				+ "NwDSGNmGRccqNJfT\n"
				+ "SBSSmgrrgGHnvSzwGVWDCzMCpLZtMsstLM\n"
				+ "sbjHQsBlBQrrGjQjBqCRSnSCpnfngLnFhJngFfSP\n"
				+ "zHVctHDcZtdJffnPpcSpFn\n"
				+ "ZdwNMztdvzVdrqblvWsqHvBR\n"
				+ "jPdjFPSbVDMMbqZzQWzQ\n"
				+ "hFRrJlpprGhtlJGQzmCRmZBWQCHRQR\n"
				+ "vThNplJpNhltNNlvcGDvwVFgnPwvSgPSSfjS\n"
				+ "DhDTPQpTDmQbDQrrrWtWPJNNrrsJ\n"
				+ "qqGjgwCgVRjMSRwMMGRGqjwvsNJJBZtrstvNBvHWHJvL\n"
				+ "VqqgfjzfgfFGVjRggCGznhlbTpQchcshpdFlnDbn\n"
				+ "DpTQTBbCZQVJQZJjrFllGdlvMPlMLqGBGvLl\n"
				+ "hmnWHWWNzzmHsmWRlGGpdLgLHGlqvgqg\n"
				+ "RzcWRhRnRnfmswfwtzzRWrDTrrFCQTCpQpcCrjjQCp\n"
				+ "HLvpHvGcBTDFznvfqT\n"
				+ "hCPQbPZPbjSbwwjCPChSClJJfzqTggTFDfsJngDg\n"
				+ "StqmmZbdqrQmhQrrhZWcRcGBpBHWVcLctMWp\n"
				+ "dNnRNbRdbRJMBMBVVThn\n"
				+ "rNrsLNscFsCDjpwTMgBGWMGjJjWBVJ\n"
				+ "wNcLpqHNsCprsfLFsHwRvPSSPRZRtRQSqtQPmP\n"
				+ "PPhGfbthhBDVsTDtDqRR\n"
				+ "mCmSNmqpcqjjrCScWRsZDpHsDQRZQDZDss\n"
				+ "CcWzNmccrjjvqBGzzdPGnv\n"
				+ "SDRmCSFfcSFFcfDmDBFSCfdVJhpzZjNJTNzRTvjzjhzNjTtZ\n"
				+ "ngGsltrMWrblNpNTJJplJN\n"
				+ "PGGnGsWngrGLQHHtHHHgWsHSBLqqfLcqBdVdcCDDBFdCDm\n"
				+ "VPjGwhwVPhrnqhzJmQvQTQvmzBzw\n"
				+ "ZBDBRbLLdtfRLlddLlCLCZMgmFJQFDcvzMQmgMzzJJFJ\n"
				+ "LHLWltHlRZCtBVhVVHPjGSpphp\n"
				+ "JqhlhdnnmfRVVSpzWLjzVLGpvB\n"
				+ "stQtFTTrsZQPFQNNDtQgLzzSLvjvLGLBGSZGGWJv\n"
				+ "DDDFFgDPbTwbTTJMCMcbCqqmmRRCnb\n"
				+ "JbDWPDPPJJDMDjHPZHGbHGVZTBhrzBpdzszdTTphdNdWdrpv\n"
				+ "RmRRqllqffwFtqwLCsqTNvpCsqCNqvdN\n"
				+ "fmfLmStlnnfnRtfcnQbbjPjPPggZGVsMQMbb\n"
				+ "WJggvGDJSwWgSfgvfSMGqqQHBcPjcHChcQBCssDHCTTQ\n"
				+ "mlRnbrnbnltblwdnnpbLRdCCjCTHTjPTTsQcTrHHhCcj\n"
				+ "bFLbdmzRpvSwfFFNWN\n"
				+ "BHnDnQHnHMWLwzWPzD\n"
				+ "dmlZCrdqLZzZVZJM\n"
				+ "tRRtdlLCjLmqCRsrSLrvvRQNFQnbgRTQQNHTBbGQQh\n"
				+ "ZrQPQWCrJnPdQSNTmBJNTHGHJN\n"
				+ "zhFRfswjwhhsFttfsfvQftRtLTzmBTHGTBmzMLHHLmGHNTTS\n"
				+ "hQhwqVjQwsdggrZZCWVl\n"
				+ "VjfnQgVQjblChfjVJlbzLtrSLlTGtztHTtsTGH\n"
				+ "DDqWQDQMWmDwWNwcqdWvpSrtLpLsptMprMStstMz\n"
				+ "vQcddRdRvWcwWRmmmmddZmmfVnnngJJbZnCBnBhhFbhCgJ\n"
				+ "gVgDnnmJdQVdJJgtgDjBsBhsBSPRSRRSSwccSbSqwPcCPcSC\n"
				+ "HrQHlHFpQfTHzzWzwScPPCRfLbPSfCSR\n"
				+ "TTQlZNTzlZNMWvrZMlpnhnVtnDDnVNtVJnjmhg\n"
				+ "MCmmssFnZJcNNszfpvvrpvJzvwpp\n"
				+ "BRRRWQWbSRGGRTTtZHWSqTrvDfgfdfrrwrDgfbvfzfrd\n"
				+ "jRBhWRWTSRttQBZMNchNCsmFMchP\n"
				+ "GBDncllqcSlNFZWBFWPjHVbw\n"
				+ "LQphJlJzLCwPjHbpHZvV\n"
				+ "hzCMJLMzTsrdrszQCCCTCQCDlqqnNmggqfGmgdmGgcmSNt\n"
				+ "hFVVbqJsqhcnBRTRGBTh\n"
				+ "lwdDpmzdNznzZBgGRRjR\n"
				+ "HdmvNvSCmDmwNDFrMJMqJFCRfsbq\n"
				+ "ctnbTcFTnbwSSfrrMLRhpJLMRdpwdJJR\n"
				+ "vdGCVBmGVHPLBRWhpRLJJZ\n"
				+ "VmQPHqvsPdlQsVHDftnlFTbffnbttfTF\n"
				+ "LBJZHrhLThHddcMLVtcMcL\n"
				+ "CPMNFDDMpGqFjjSPDPDqdvmdtQgVQQcQWcQgQQsj\n"
				+ "DzFDFMRSFPSGTJJTJBwwRhBw\n"
				+ "dpldqlqlRppFTHpbjbnLRLVnnGfjtG\n"
				+ "NNJTcmhzvJQNgMJBwcGtjtGbttfhtsGGnhnt\n"
				+ "rzcwmgvcvrBNvvmMgvcBzwHPCTWWprqPHqTFWdPCWDTF\n"
				+ "BNllDRTNqDNvNDDLBcDvBCLVJrVdJdtrnrCHggtrdd\n"
				+ "mppFMFjpMFZQZQGjFCdgrCrCdrvVGtJJCC\n"
				+ "PZsQmfPphvPjSsjmPjfZllBwcNRDNcDqNNWbTclS\n"
				+ "fjqZBSDSDwwsQwCDND\n"
				+ "rrdMdjVWtTTPslsslFLTLCsJ\n"
				+ "rvPWbvcmHjmdPbHvrvBHgqRRgqHGgfZGfHRS\n"
				+ "ggTQgsgwFrTrggbMTvSdmjfCmmQDcmqjDjmc\n"
				+ "nLZnRhNZnnNHZhZVStCcDqjcqmjSjH\n"
				+ "RWGNnhzBnJJRRWNRBNZNLZhFMTFPvrTrTlsggPwSlFMWTw\n"
				+ "RNmnPRnLGcQmzBQpHHjTltjtlfgspbsq\n"
				+ "CZvCJwZMMCCMdFVcwJJsgTTHfsTlbfbgbT\n"
				+ "SSVFhWCZdSCcWCcWdrvhzmnnnLNGDRDNzzLNGz\n"
				+ "jPwfPwNfFpFNQpDjdMcjcrdddDHD\n"
				+ "tzsRsGRLzhLhvqvhHMlqqV\n"
				+ "LRBnRBGSnBSGsGSGmGtBJCmnNWZpPpTNPMwQMPNJFZTTNwWT\n"
				+ "PCrStRPSPvZQcZPvqvfjSRWFFNFJFLZTTJTTVZFFGLFF\n"
				+ "DlpBzBntHDzhlpGJVHLwTMFLVLTL\n"
				+ "gptBBdgzpsBbpQvvPQPRqrdcCC\n";
		
		String[] bags = input.split("\n");
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[] charlowercase = lowercase.toCharArray();		
		char[] charuppercase = uppercase.toCharArray();	
		
		char commonLetter = 'a';
		int index = new String(charlowercase).indexOf(commonLetter);
		int sum = 0;
		
		boolean equal = false;
		//forschleife für teilaufgabe 1
		for (int i = 0; i < bags.length; i++) {
			
			int itemlength = bags[i].length();
			String comp1 = bags[i].substring(0, (itemlength/2));
			String comp2 = bags[i].substring((itemlength/2), itemlength);
			
			char[] comp1char = comp1.toCharArray();
			char[] comp2char = comp2.toCharArray();
			
			for( int j= 0; j<comp1char.length;j++) {
				for(int k = 0; k< comp2char.length; k++){
					if(comp1char[j] == comp2char[k]) {
						
						commonLetter = comp1char[j];
						
						if(Character.isLowerCase(commonLetter)) index = 1 + new String(charlowercase).indexOf(commonLetter);
						else index = 27 + new String(charuppercase).indexOf(commonLetter);
						
					}
				}
			}
			
			sum+= index;
		}
		sum=0;
		//forschleife für teilaufgabe 2
		for(int i = 0; i < bags.length; i+=3) {
			//System.out.println(bags[0]);
			//System.out.println(bags[1]);
			
				char[] charfirst = bags[i].toCharArray();
				char[] charsecond = bags[i+1].toCharArray();
				char[] charthird = bags[i+2].toCharArray();
				
				for(int a = 0; a < charfirst.length; a++) {
					for(int b = 0; b< charsecond.length; b++) {
						for (int c = 0; c< charthird.length; c++) {
							if(charfirst[a] == charsecond[b] && charfirst[a]== charthird[c]) {
								commonLetter= charfirst[a];
								if(Character.isLowerCase(commonLetter)) index = 1 + new String(charlowercase).indexOf(commonLetter);
								else index = 27 + new String(charuppercase).indexOf(commonLetter);
								}
							}
						}
				}
				sum+=index;
		}
		System.out.println(sum);
		
	}

}
