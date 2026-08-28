import com.mojang.serialization.Codec;

public class ku {
   public static final kt.b<ks> a = a("damage", ks.a);
   public static final kt.b<kv.a> b = a("enchantments", kv.a.a);
   public static final kt.b<kv.b> c = a("stored_enchantments", kv.b.a);
   public static final kt.b<kz> d = a("potion_contents", kz.a);
   public static final kt.b<kr> e = a("custom_data", kr.a);
   public static final kt.b<kq> f = a("container", kq.a);
   public static final kt.b<kp> g = a("bundle_contents", kp.a);
   public static final kt.b<kw> h = a("firework_explosion", kw.a);
   public static final kt.b<kx> i = a("fireworks", kx.a);
   public static final kt.b<lb> j = a("writable_book_content", lb.a);
   public static final kt.b<lc> k = a("written_book_content", lc.a);
   public static final kt.b<ko> l = a("attribute_modifiers", ko.a);
   public static final kt.b<la> m = a("trim", la.a);
   public static final kt.b<ky> n = a("jukebox_playable", ky.a);

   private static <T extends kt> kt.b<T> a(String $$0, Codec<T> $$1) {
      return js.a(mg.ao, $$0, new kt.b<>($$1));
   }

   public static kt.b<?> a(js<kt.b<?>> $$0) {
      return a;
   }
}
