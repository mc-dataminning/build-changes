import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gre implements bsn {
   private final grv a;
   private final Set<bsl> b = new ObjectOpenHashSet();
   private final bst c = new bst();

   public gre(LongSupplier $$0, grv $$1) {
      this.a = $$1;
      this.b.add(bsu.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bsu.a());
      this.b.add(bsl.a("totalChunks", bsk.f, this.a, grv::g));
      this.b.add(bsl.a("renderedChunks", bsk.f, this.a, grv::i));
      this.b.add(bsl.a("lastViewDistance", bsk.f, this.a, grv::h));
      gvq $$0 = this.a.f();
      this.b.add(bsl.a("toUpload", bsk.g, $$0, gvq::c));
      this.b.add(bsl.a("freeBufferCount", bsk.g, $$0, gvq::d));
      this.b.add(bsl.a("toBatchCount", bsk.g, $$0, gvq::b));
      if (fld.a().isPresent()) {
         this.b.add(bsl.a("gpuUtilization", bsk.i, frd.Q(), frd::v));
      }
   }

   @Override
   public Set<bsl> a(Supplier<bqy> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
