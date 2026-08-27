import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class kz extends kv<kz> implements ku {
   private static final ku.a<kz> a = new ku.a<kz>() {
      public kz a(kv<kz> $$0, StringReader $$1, ix.a $$2) {
         return (kz)$$0;
      }
   };
   private final Codec<kz> b = Codec.unit(this::f);
   private final yq<wd, kz> c = yq.a(this);

   protected kz(boolean $$0) {
      super($$0, a);
   }

   public kz f() {
      return this;
   }

   @Override
   public Codec<kz> d() {
      return this.b;
   }

   @Override
   public yq<wd, kz> e() {
      return this.c;
   }

   @Override
   public String a(ix.a $$0) {
      return lc.j.b(this).toString();
   }
}
