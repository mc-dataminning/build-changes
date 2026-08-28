public class zn {
   public static final yx<zc> a = a("custom_payload");
   public static final yx<zd> b = a("custom_report_details");
   public static final yx<ze> c = a("disconnect");
   public static final yx<zf> d = a("keep_alive");
   public static final yx<zg> e = a("ping");
   public static final yx<zh> f = a("resource_pack_pop");
   public static final yx<zi> g = a("resource_pack_push");
   public static final yx<zj> h = a("server_links");
   public static final yx<zk> i = a("store_cookie");
   public static final yx<zl> j = a("transfer");
   public static final yx<zm> k = a("update_tags");
   public static final yx<zp> l = b("client_information");
   public static final yx<zq> m = b("custom_payload");
   public static final yx<zr> n = b("keep_alive");
   public static final yx<zs> o = b("pong");
   public static final yx<zt> p = b("resource_pack");

   private static <T extends yv<zb>> yx<T> a(String $$0) {
      return new yx<>(yw.b, aku.b($$0));
   }

   private static <T extends yv<zo>> yx<T> b(String $$0) {
      return new yx<>(yw.a, aku.b($$0));
   }
}
