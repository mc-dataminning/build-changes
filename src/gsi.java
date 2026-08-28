import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public record gsi(List<gsm> b) implements gsd.a {
   public static final Codec<gsi> a = ayu.b(ayu.a(gsm.a)).xmap(gsi::new, gsi::a);

   public gsi(List<gsm> b) {
      if (b.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.b = b;
      }
   }

   @Override
   public Object a(eat $$0) {
      return this;
   }

   @Override
   public void a(hmi.a $$0) {
      this.b.forEach($$1 -> $$0.markDependency($$1.a()));
   }

   private static gsd a(hlz $$0, gsm $$1) {
      return gsj.a($$0, $$1.a(), $$1.b().a());
   }

   @Override
   public gsd a(hlz $$0) {
      if (this.b.size() == 1) {
         gsm $$1 = this.b.getFirst();
         return a($$0, $$1);
      } else {
         bsq.a<gsd> $$2 = bsq.b();

         for (gsm $$3 : this.b) {
            $$2.a(a($$0, $$3), $$3.c());
         }

         return new hmn($$2.a());
      }
   }

   public gsi a(gsn $$0) {
      List<gsm> $$1;
      if (this.b.size() == 1) {
         $$1 = List.of($$0.apply(this.b.getFirst()));
      } else {
         $$1 = List.copyOf(Lists.transform(this.b, $$0::apply));
      }

      return new gsi($$1);
   }

   public List<gsm> a() {
      return this.b;
   }
}
