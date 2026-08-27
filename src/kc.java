import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class kc extends jy<kc> implements jx {
   private static final jx.a<kc> a = new jx.a<kc>() {
      public kc a(jy<kc> $$0, StringReader $$1) {
         return (kc)$$0;
      }
   };
   private final Codec<kc> b = Codec.unit(this::g);
   private final xo<vb, kc> c = xo.a(this);

   protected kc(boolean $$0) {
      super($$0, a);
   }

   public kc g() {
      return this;
   }

   @Override
   public Codec<kc> e() {
      return this.b;
   }

   @Override
   public xo<vb, kc> f() {
      return this.c;
   }

   @Override
   public String a() {
      return kf.j.b(this).toString();
   }
}
