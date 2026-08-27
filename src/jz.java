import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class jz extends jv<jz> implements ju {
   private static final ju.a<jz> a = new ju.a<jz>() {
      public jz a(jv<jz> $$0, StringReader $$1) {
         return (jz)$$0;
      }

      public jz a(jv<jz> $$0, ty $$1) {
         return (jz)$$0;
      }
   };
   private final Codec<jz> b = Codec.unit(this::f);

   protected jz(boolean $$0) {
      super($$0, a);
   }

   public jz f() {
      return this;
   }

   @Override
   public Codec<jz> e() {
      return this.b;
   }

   @Override
   public void a(ty $$0) {
   }

   @Override
   public String a() {
      return kc.k.b(this).toString();
   }
}
