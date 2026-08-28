import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gqr implements bsy {
   private final gri a;
   private final Set<bsw> b = new ObjectOpenHashSet();
   private final bte c = new bte();

   public gqr(LongSupplier $$0, gri $$1) {
      this.a = $$1;
      this.b.add(btf.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(btf.a());
      this.b.add(bsw.a("totalChunks", bsv.f, this.a, gri::g));
      this.b.add(bsw.a("renderedChunks", bsv.f, this.a, gri::i));
      this.b.add(bsw.a("lastViewDistance", bsv.f, this.a, gri::h));
      gvd $$0 = this.a.f();
      this.b.add(bsw.a("toUpload", bsv.g, $$0, gvd::c));
      this.b.add(bsw.a("freeBufferCount", bsv.g, $$0, gvd::d));
      this.b.add(bsw.a("toBatchCount", bsv.g, $$0, gvd::b));
      if (fkw.a().isPresent()) {
         this.b.add(bsw.a("gpuUtilization", bsv.i, fqq.Q(), fqq::v));
      }
   }

   @Override
   public Set<bsw> a(Supplier<brj> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
