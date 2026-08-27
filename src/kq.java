import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class kq extends km<kq> implements kl {
   private static final kl.a<kq> a = new kl.a<kq>() {
      public kq a(km<kq> $$0, StringReader $$1, ip.a $$2) {
         return (kq)$$0;
      }
   };
   private final Codec<kq> b = Codec.unit(this::f);
   private final yg<vt, kq> c = yg.a(this);

   protected kq(boolean $$0) {
      super($$0, a);
   }

   public kq f() {
      return this;
   }

   @Override
   public Codec<kq> d() {
      return this.b;
   }

   @Override
   public yg<vt, kq> e() {
      return this.c;
   }

   @Override
   public String a(ip.a $$0) {
      return kt.j.b(this).toString();
   }
}
