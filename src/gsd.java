import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public record gsd(List<gsh> b) implements gry.a {
   public static final Codec<gsd> a = ayu.b(ayu.a(gsh.a)).xmap(gsd::new, gsd::a);

   public gsd(List<gsh> b) {
      if (b.isEmpty()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.b = b;
      }
   }

   @Override
   public Object a(eao $$0) {
      return this;
   }

   @Override
   public void a(hmb.a $$0) {
      this.b.forEach($$1 -> $$0.markDependency($$1.a()));
   }

   private static gry a(hls $$0, gsh $$1) {
      return gse.a($$0, $$1.a(), $$1.b().a());
   }

   @Override
   public gry a(hls $$0) {
      if (this.b.size() == 1) {
         gsh $$1 = this.b.getFirst();
         return a($$0, $$1);
      } else {
         bsq.a<gry> $$2 = bsq.b();

         for (gsh $$3 : this.b) {
            $$2.a(a($$0, $$3), $$3.c());
         }

         return new hmg($$2.a());
      }
   }

   public gsd a(gsi $$0) {
      List<gsh> $$1;
      if (this.b.size() == 1) {
         $$1 = List.of($$0.apply(this.b.getFirst()));
      } else {
         $$1 = List.copyOf(Lists.transform(this.b, $$0::apply));
      }

      return new gsd($$1);
   }

   public List<gsh> a() {
      return this.b;
   }
}
