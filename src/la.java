import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class la extends kw<la> implements kv {
   private static final kv.a<la> a = new kv.a<la>() {
      public la a(kw<la> $$0, StringReader $$1, iy.a $$2) {
         return (la)$$0;
      }
   };
   private final Codec<la> b = Codec.unit(this::f);
   private final ys<wf, la> c = ys.a(this);

   protected la(boolean $$0) {
      super($$0, a);
   }

   public la f() {
      return this;
   }

   @Override
   public Codec<la> d() {
      return this.b;
   }

   @Override
   public ys<wf, la> e() {
      return this.c;
   }

   @Override
   public String a(iy.a $$0) {
      return ld.j.b(this).toString();
   }
}
