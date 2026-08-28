import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gkf implements bqz {
   private final gla a;
   private final Set<bqx> b = new ObjectOpenHashSet();
   private final brf c = new brf();

   public gkf(LongSupplier $$0, gla $$1) {
      this.a = $$1;
      this.b.add(brg.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(brg.a());
      this.b.add(bqx.a("totalChunks", bqw.f, this.a, gla::h));
      this.b.add(bqx.a("renderedChunks", bqw.f, this.a, gla::j));
      this.b.add(bqx.a("lastViewDistance", bqw.f, this.a, gla::i));
      gor $$0 = this.a.g();
      this.b.add(bqx.a("toUpload", bqw.g, $$0, gor::c));
      this.b.add(bqx.a("freeBufferCount", bqw.g, $$0, gor::d));
      this.b.add(bqx.a("toBatchCount", bqw.g, $$0, gor::b));
      if (fge.a().isPresent()) {
         this.b.add(bqx.a("gpuUtilization", bqw.i, flz.Q(), flz::v));
      }
   }

   @Override
   public Set<bqx> a(Supplier<bpl> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
