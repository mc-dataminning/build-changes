public class zd {
   public static final yp<yu> a = a("custom_payload");
   public static final yp<yv> b = a("disconnect");
   public static final yp<yw> c = a("keep_alive");
   public static final yp<yx> d = a("ping");
   public static final yp<yy> e = a("resource_pack_pop");
   public static final yp<yz> f = a("resource_pack_push");
   public static final yp<za> g = a("store_cookie");
   public static final yp<zb> h = a("transfer");
   public static final yp<zc> i = a("update_tags");
   public static final yp<zf> j = b("client_information");
   public static final yp<zg> k = b("custom_payload");
   public static final yp<zh> l = b("keep_alive");
   public static final yp<zi> m = b("pong");
   public static final yp<zj> n = b("resource_pack");

   private static <T extends yn<yt>> yp<T> a(String $$0) {
      return new yp<>(yo.b, new ajt($$0));
   }

   private static <T extends yn<ze>> yp<T> b(String $$0) {
      return new yp<>(yo.a, new ajt($$0));
   }
}
