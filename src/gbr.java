import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gbr implements bnr {
   private final gci a;
   private final Set<bnp> b = new ObjectOpenHashSet();
   private final bnx c = new bnx();

   public gbr(LongSupplier $$0, gci $$1) {
      this.a = $$1;
      this.b.add(bny.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bny.a());
      this.b.add(bnp.a("totalChunks", bno.f, this.a, gci::i));
      this.b.add(bnp.a("renderedChunks", bno.f, this.a, gci::k));
      this.b.add(bnp.a("lastViewDistance", bno.f, this.a, gci::j));
      gfk $$0 = this.a.h();
      this.b.add(bnp.a("toUpload", bno.g, $$0, gfk::c));
      this.b.add(bnp.a("freeBufferCount", bno.g, $$0, gfk::d));
      this.b.add(bnp.a("toBatchCount", bno.g, $$0, gfk::b));
      if (eyl.a().isPresent()) {
         this.b.add(bnp.a("gpuUtilization", bno.i, fdz.Q(), fdz::v));
      }
   }

   @Override
   public Set<bnp> a(Supplier<bmg> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
