import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gih implements bqf {
   private final gjc a;
   private final Set<bqd> b = new ObjectOpenHashSet();
   private final bql c = new bql();

   public gih(LongSupplier $$0, gjc $$1) {
      this.a = $$1;
      this.b.add(bqm.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bqm.a());
      this.b.add(bqd.a("totalChunks", bqc.f, this.a, gjc::h));
      this.b.add(bqd.a("renderedChunks", bqc.f, this.a, gjc::j));
      this.b.add(bqd.a("lastViewDistance", bqc.f, this.a, gjc::i));
      gmt $$0 = this.a.g();
      this.b.add(bqd.a("toUpload", bqc.g, $$0, gmt::c));
      this.b.add(bqd.a("freeBufferCount", bqc.g, $$0, gmt::d));
      this.b.add(bqd.a("toBatchCount", bqc.g, $$0, gmt::b));
      if (fek.a().isPresent()) {
         this.b.add(bqd.a("gpuUtilization", bqc.i, fke.Q(), fke::v));
      }
   }

   @Override
   public Set<bqd> a(Supplier<bor> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
