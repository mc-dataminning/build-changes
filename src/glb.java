import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class glb implements bqf {
   private final glu a;
   private final Set<bqd> b = new ObjectOpenHashSet();
   private final bql c = new bql();

   public glb(LongSupplier $$0, glu $$1) {
      this.a = $$1;
      this.b.add(bqm.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bqm.a());
      this.b.add(bqd.a("totalChunks", bqc.f, this.a, glu::h));
      this.b.add(bqd.a("renderedChunks", bqc.f, this.a, glu::j));
      this.b.add(bqd.a("lastViewDistance", bqc.f, this.a, glu::i));
      gpm $$0 = this.a.g();
      this.b.add(bqd.a("toUpload", bqc.g, $$0, gpm::c));
      this.b.add(bqd.a("freeBufferCount", bqc.g, $$0, gpm::d));
      this.b.add(bqd.a("toBatchCount", bqc.g, $$0, gpm::b));
      if (ffn.a().isPresent()) {
         this.b.add(bqd.a("gpuUtilization", bqc.i, flj.Q(), flj::v));
      }
   }

   @Override
   public Set<bqd> a(Supplier<boq> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
