import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class glc implements bqg {
   private final glv a;
   private final Set<bqe> b = new ObjectOpenHashSet();
   private final bqm c = new bqm();

   public glc(LongSupplier $$0, glv $$1) {
      this.a = $$1;
      this.b.add(bqn.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bqn.a());
      this.b.add(bqe.a("totalChunks", bqd.f, this.a, glv::h));
      this.b.add(bqe.a("renderedChunks", bqd.f, this.a, glv::j));
      this.b.add(bqe.a("lastViewDistance", bqd.f, this.a, glv::i));
      gpn $$0 = this.a.g();
      this.b.add(bqe.a("toUpload", bqd.g, $$0, gpn::c));
      this.b.add(bqe.a("freeBufferCount", bqd.g, $$0, gpn::d));
      this.b.add(bqe.a("toBatchCount", bqd.g, $$0, gpn::b));
      if (ffo.a().isPresent()) {
         this.b.add(bqe.a("gpuUtilization", bqd.i, flk.Q(), flk::v));
      }
   }

   @Override
   public Set<bqe> a(Supplier<bor> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
