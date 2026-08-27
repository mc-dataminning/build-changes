import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class ke extends ka<ke> implements jz {
   private static final jz.a<ke> a = new jz.a<ke>() {
      public ke a(ka<ke> $$0, StringReader $$1, in.a $$2) {
         return (ke)$$0;
      }
   };
   private final Codec<ke> b = Codec.unit(this::f);
   private final xq<vd, ke> c = xq.a(this);

   protected ke(boolean $$0) {
      super($$0, a);
   }

   public ke f() {
      return this;
   }

   @Override
   public Codec<ke> d() {
      return this.b;
   }

   @Override
   public xq<vd, ke> e() {
      return this.c;
   }

   @Override
   public String a(in.a $$0) {
      return kh.j.b(this).toString();
   }
}
