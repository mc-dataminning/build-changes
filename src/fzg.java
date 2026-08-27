import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fzg implements blx {
   private final fzx a;
   private final Set<blv> b = new ObjectOpenHashSet();
   private final bmd c = new bmd();

   public fzg(LongSupplier $$0, fzx $$1) {
      this.a = $$1;
      this.b.add(bme.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bme.a());
      this.b.add(blv.a("totalChunks", blu.f, this.a, fzx::i));
      this.b.add(blv.a("renderedChunks", blu.f, this.a, fzx::k));
      this.b.add(blv.a("lastViewDistance", blu.f, this.a, fzx::j));
      gcz $$0 = this.a.h();
      this.b.add(blv.a("toUpload", blu.g, $$0, gcz::c));
      this.b.add(blv.a("freeBufferCount", blu.g, $$0, gcz::d));
      this.b.add(blv.a("toBatchCount", blu.g, $$0, gcz::b));
      if (ewb.a().isPresent()) {
         this.b.add(blv.a("gpuUtilization", blu.i, fbp.Q(), fbp::v));
      }
   }

   @Override
   public Set<blv> a(Supplier<bkm> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
