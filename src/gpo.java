import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gpo implements bsc {
   private final gqh a;
   private final Set<bsa> b = new ObjectOpenHashSet();
   private final bsi c = new bsi();

   public gpo(LongSupplier $$0, gqh $$1) {
      this.a = $$1;
      this.b.add(bsj.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bsj.a());
      this.b.add(bsa.a("totalChunks", brz.f, this.a, gqh::g));
      this.b.add(bsa.a("renderedChunks", brz.f, this.a, gqh::i));
      this.b.add(bsa.a("lastViewDistance", brz.f, this.a, gqh::h));
      gub $$0 = this.a.f();
      this.b.add(bsa.a("toUpload", brz.g, $$0, gub::c));
      this.b.add(bsa.a("freeBufferCount", brz.g, $$0, gub::d));
      this.b.add(bsa.a("toBatchCount", brz.g, $$0, gub::b));
      if (fjn.a().isPresent()) {
         this.b.add(bsa.a("gpuUtilization", brz.i, fpo.Q(), fpo::v));
      }
   }

   @Override
   public Set<bsa> a(Supplier<bqn> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
