import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gou implements bry {
   private final gpn a;
   private final Set<brw> b = new ObjectOpenHashSet();
   private final bse c = new bse();

   public gou(LongSupplier $$0, gpn $$1) {
      this.a = $$1;
      this.b.add(bsf.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bsf.a());
      this.b.add(brw.a("totalChunks", brv.f, this.a, gpn::h));
      this.b.add(brw.a("renderedChunks", brv.f, this.a, gpn::j));
      this.b.add(brw.a("lastViewDistance", brv.f, this.a, gpn::i));
      gth $$0 = this.a.g();
      this.b.add(brw.a("toUpload", brv.g, $$0, gth::c));
      this.b.add(brw.a("freeBufferCount", brv.g, $$0, gth::d));
      this.b.add(brw.a("toBatchCount", brv.g, $$0, gth::b));
      if (fiv.a().isPresent()) {
         this.b.add(brw.a("gpuUtilization", brv.i, fos.Q(), fos::v));
      }
   }

   @Override
   public Set<brw> a(Supplier<bqj> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
