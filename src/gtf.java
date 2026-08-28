import java.util.List;
import javax.annotation.Nullable;

public record gtf(hng a, boolean b, hkq c) implements gsz {
   public static gtf a(hmz $$0, alr $$1, hnf $$2) {
      hni $$3 = $$0.a($$1);
      gti $$4 = $$3.g();
      boolean $$5 = $$3.c();
      hkq $$6 = $$3.a($$4, $$0);
      hng $$7 = $$3.a($$4, $$0, $$2);
      return new gtf($$7, $$5, $$6);
   }

   @Override
   public List<gst> a(@Nullable jc $$0) {
      return this.a.a($$0);
   }

   public hng c() {
      return this.a;
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hkq b() {
      return this.c;
   }
}
