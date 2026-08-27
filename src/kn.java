import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class kn implements ku {
   public static final ku.a<kn> a = new ku.a<kn>() {
      public kn a(kv<kn> $$0, StringReader $$1, ix.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new kn($$0, fv.a(lc.e.p(), $$1, false).a());
      }
   };
   private final kv<kn> b;
   private final dpy c;

   public static Codec<kn> a(kv<kn> $$0) {
      return dpy.b.xmap($$1 -> new kn($$0, $$1), $$0x -> $$0x.c);
   }

   public static yq<? super wd, kn> b(kv<kn> $$0) {
      return yo.a(dcv.q).a($$1 -> new kn($$0, $$1), $$0x -> $$0x.c);
   }

   public kn(kv<kn> $$0, dpy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(ix.a $$0) {
      return lc.j.b(this.a()) + " " + fv.a(this.c);
   }

   @Override
   public kv<kn> a() {
      return this.b;
   }

   public dpy b() {
      return this.c;
   }
}
