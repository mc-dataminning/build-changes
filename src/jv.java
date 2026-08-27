import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class jv extends jr<jv> implements jq {
   private static final jq.a<jv> a = new jq.a<jv>() {
      public jv a(jr<jv> $$0, StringReader $$1) {
         return (jv)$$0;
      }

      public jv a(jr<jv> $$0, tl $$1) {
         return (jv)$$0;
      }
   };
   private final Codec<jv> b = Codec.unit(this::f);

   protected jv(boolean $$0) {
      super($$0, a);
   }

   public jv f() {
      return this;
   }

   @Override
   public Codec<jv> e() {
      return this.b;
   }

   @Override
   public void a(tl $$0) {
   }

   @Override
   public String a() {
      return jy.k.b(this).toString();
   }
}
