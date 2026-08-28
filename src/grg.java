import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class grg implements bsp {
   private final grx a;
   private final Set<bsn> b = new ObjectOpenHashSet();
   private final bsv c = new bsv();

   public grg(LongSupplier $$0, grx $$1) {
      this.a = $$1;
      this.b.add(bsw.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bsw.a());
      this.b.add(bsn.a("totalChunks", bsm.f, this.a, grx::g));
      this.b.add(bsn.a("renderedChunks", bsm.f, this.a, grx::i));
      this.b.add(bsn.a("lastViewDistance", bsm.f, this.a, grx::h));
      gvs $$0 = this.a.f();
      this.b.add(bsn.a("toUpload", bsm.g, $$0, gvs::c));
      this.b.add(bsn.a("freeBufferCount", bsm.g, $$0, gvs::d));
      this.b.add(bsn.a("toBatchCount", bsm.g, $$0, gvs::b));
      if (flf.a().isPresent()) {
         this.b.add(bsn.a("gpuUtilization", bsm.i, frf.Q(), frf::v));
      }
   }

   @Override
   public Set<bsn> a(Supplier<bra> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
