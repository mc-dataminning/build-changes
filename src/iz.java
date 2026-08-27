import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class iz extends iv<iz> implements iu {
   private static final iu.a<iz> a = new iu.a<iz>() {
      public iz a(iv<iz> $$0, StringReader $$1) {
         return (iz)$$0;
      }

      public iz a(iv<iz> $$0, sh $$1) {
         return (iz)$$0;
      }
   };
   private final Codec<iz> b = Codec.unit(this::f);

   protected iz(boolean $$0) {
      super($$0, a);
   }

   public iz f() {
      return this;
   }

   @Override
   public Codec<iz> e() {
      return this.b;
   }

   @Override
   public void a(sh $$0) {
   }

   @Override
   public String a() {
      return jc.k.b(this).toString();
   }
}
