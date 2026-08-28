import com.mojang.serialization.Codec;

public class kv {
   public static final ku.b<kt> a = a("damage", kt.a);
   public static final ku.b<kw.a> b = a("enchantments", kw.a.a);
   public static final ku.b<kw.b> c = a("stored_enchantments", kw.b.a);
   public static final ku.b<la> d = a("potion_contents", la.a);
   public static final ku.b<ks> e = a("custom_data", ks.a);
   public static final ku.b<kr> f = a("container", kr.a);
   public static final ku.b<kq> g = a("bundle_contents", kq.a);
   public static final ku.b<kx> h = a("firework_explosion", kx.a);
   public static final ku.b<ky> i = a("fireworks", ky.a);
   public static final ku.b<lc> j = a("writable_book_content", lc.a);
   public static final ku.b<ld> k = a("written_book_content", ld.a);
   public static final ku.b<kp> l = a("attribute_modifiers", kp.a);
   public static final ku.b<lb> m = a("trim", lb.a);
   public static final ku.b<kz> n = a("jukebox_playable", kz.a);

   private static <T extends ku> ku.b<T> a(String $$0, Codec<T> $$1) {
      return jt.a(mh.ao, $$0, new ku.b<>($$1));
   }

   public static ku.b<?> a(jt<ku.b<?>> $$0) {
      return a;
   }
}
