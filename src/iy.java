import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class iy extends iu<iy> implements it {
   private static final it.a<iy> a = new it.a<iy>() {
      public iy a(iu<iy> $$0, StringReader $$1) {
         return (iy)$$0;
      }

      public iy a(iu<iy> $$0, so $$1) {
         return (iy)$$0;
      }
   };
   private final Codec<iy> b = Codec.unit(this::f);

   protected iy(boolean $$0) {
      super($$0, a);
   }

   public iy f() {
      return this;
   }

   @Override
   public Codec<iy> e() {
      return this.b;
   }

   @Override
   public void a(so $$0) {
   }

   @Override
   public String a() {
      return jb.k.b(this).toString();
   }
}
