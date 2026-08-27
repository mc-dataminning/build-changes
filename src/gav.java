import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gav implements bnj {
   private final gbm a;
   private final Set<bnh> b = new ObjectOpenHashSet();
   private final bnp c = new bnp();

   public gav(LongSupplier $$0, gbm $$1) {
      this.a = $$1;
      this.b.add(bnq.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bnq.a());
      this.b.add(bnh.a("totalChunks", bng.f, this.a, gbm::i));
      this.b.add(bnh.a("renderedChunks", bng.f, this.a, gbm::k));
      this.b.add(bnh.a("lastViewDistance", bng.f, this.a, gbm::j));
      geo $$0 = this.a.h();
      this.b.add(bnh.a("toUpload", bng.g, $$0, geo::c));
      this.b.add(bnh.a("freeBufferCount", bng.g, $$0, geo::d));
      this.b.add(bnh.a("toBatchCount", bng.g, $$0, geo::b));
      if (exq.a().isPresent()) {
         this.b.add(bnh.a("gpuUtilization", bng.i, fde.Q(), fde::v));
      }
   }

   @Override
   public Set<bnh> a(Supplier<bly> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
