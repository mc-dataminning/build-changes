import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gal implements bmn {
   private final gbc a;
   private final Set<bml> b = new ObjectOpenHashSet();
   private final bmt c = new bmt();

   public gal(LongSupplier $$0, gbc $$1) {
      this.a = $$1;
      this.b.add(bmu.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bmu.a());
      this.b.add(bml.a("totalChunks", bmk.f, this.a, gbc::i));
      this.b.add(bml.a("renderedChunks", bmk.f, this.a, gbc::k));
      this.b.add(bml.a("lastViewDistance", bmk.f, this.a, gbc::j));
      gee $$0 = this.a.h();
      this.b.add(bml.a("toUpload", bmk.g, $$0, gee::c));
      this.b.add(bml.a("freeBufferCount", bmk.g, $$0, gee::d));
      this.b.add(bml.a("toBatchCount", bmk.g, $$0, gee::b));
      if (exg.a().isPresent()) {
         this.b.add(bml.a("gpuUtilization", bmk.i, fcu.Q(), fcu::v));
      }
   }

   @Override
   public Set<bml> a(Supplier<blc> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
