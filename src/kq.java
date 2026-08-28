import com.mojang.serialization.Codec;

public record kq(cy c) implements ks {
   public static final Codec<kq> a = cy.a.xmap(kq::new, kq::a);

   @Override
   public boolean a(ke $$0) {
      return this.c.a($$0);
   }

   public static kq a(cy $$0) {
      return new kq($$0);
   }

   public cy a() {
      return this.c;
   }
}
