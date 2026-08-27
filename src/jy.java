import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class jy extends ju<jy> implements jt {
   private static final jt.a<jy> a = new jt.a<jy>() {
      public jy a(ju<jy> $$0, StringReader $$1) {
         return (jy)$$0;
      }

      public jy a(ju<jy> $$0, ue $$1) {
         return (jy)$$0;
      }
   };
   private final Codec<jy> b = Codec.unit(this::f);

   protected jy(boolean $$0) {
      super($$0, a);
   }

   public jy f() {
      return this;
   }

   @Override
   public Codec<jy> e() {
      return this.b;
   }

   @Override
   public void a(ue $$0) {
   }

   @Override
   public String a() {
      return kb.j.b(this).toString();
   }
}
