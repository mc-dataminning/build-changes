public class yp {
   public static final yb<yg> a = a("custom_payload");
   public static final yb<yh> b = a("disconnect");
   public static final yb<yi> c = a("keep_alive");
   public static final yb<yj> d = a("ping");
   public static final yb<yk> e = a("resource_pack_pop");
   public static final yb<yl> f = a("resource_pack_push");
   public static final yb<ym> g = a("store_cookie");
   public static final yb<yn> h = a("transfer");
   public static final yb<yo> i = a("update_tags");
   public static final yb<yr> j = b("client_information");
   public static final yb<ys> k = b("custom_payload");
   public static final yb<yt> l = b("keep_alive");
   public static final yb<yu> m = b("pong");
   public static final yb<yv> n = b("resource_pack");

   private static <T extends xz<yf>> yb<T> a(String $$0) {
      return new yb<>(ya.b, new ajc($$0));
   }

   private static <T extends xz<yq>> yb<T> b(String $$0) {
      return new yb<>(ya.a, new ajc($$0));
   }
}
