import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ks implements ku {
   public static final ku.a<ks> a = new ku.a<ks>() {
      public ks a(kv<ks> $$0, StringReader $$1, ix.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         gl.a $$3 = new gl($$2).a($$1);
         csd $$4 = new gk($$3.a(), $$3.b()).a(1, false);
         return new ks($$0, $$4);
      }
   };
   private final kv<ks> b;
   private final csd c;

   public static Codec<ks> a(kv<ks> $$0) {
      return csd.a.xmap($$1 -> new ks($$0, $$1), $$0x -> $$0x.c);
   }

   public static yq<? super wd, ks> b(kv<ks> $$0) {
      return csd.f.a($$1 -> new ks($$0, $$1), $$0x -> $$0x.c);
   }

   public ks(kv<ks> $$0, csd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(ix.a $$0) {
      gk $$1 = new gk(this.c.g(), this.c.a());
      return lc.j.b(this.a()) + " " + $$1.a($$0);
   }

   @Override
   public kv<ks> a() {
      return this.b;
   }

   public csd b() {
      return this.c;
   }
}
