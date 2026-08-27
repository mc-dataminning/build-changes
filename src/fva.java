import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fva implements bjt {
   private final fvr a;
   private final Set<bjr> b = new ObjectOpenHashSet();
   private final bjz c = new bjz();

   public fva(LongSupplier $$0, fvr $$1) {
      this.a = $$1;
      this.b.add(bka.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bka.a());
      this.b.add(bjr.a("totalChunks", bjq.f, this.a, fvr::i));
      this.b.add(bjr.a("renderedChunks", bjq.f, this.a, fvr::k));
      this.b.add(bjr.a("lastViewDistance", bjq.f, this.a, fvr::j));
      fys $$0 = this.a.h();
      this.b.add(bjr.a("toUpload", bjq.g, $$0, fys::c));
      this.b.add(bjr.a("freeBufferCount", bjq.g, $$0, fys::d));
      this.b.add(bjr.a("toBatchCount", bjq.g, $$0, fys::b));
      if (esa.a().isPresent()) {
         this.b.add(bjr.a("gpuUtilization", bjq.i, exo.P(), exo::u));
      }
   }

   @Override
   public Set<bjr> a(Supplier<bil> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
