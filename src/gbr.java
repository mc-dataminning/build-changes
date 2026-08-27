import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gbr implements bnt {
   private final gci a;
   private final Set<bnr> b = new ObjectOpenHashSet();
   private final bnz c = new bnz();

   public gbr(LongSupplier $$0, gci $$1) {
      this.a = $$1;
      this.b.add(boa.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(boa.a());
      this.b.add(bnr.a("totalChunks", bnq.f, this.a, gci::i));
      this.b.add(bnr.a("renderedChunks", bnq.f, this.a, gci::k));
      this.b.add(bnr.a("lastViewDistance", bnq.f, this.a, gci::j));
      gfk $$0 = this.a.h();
      this.b.add(bnr.a("toUpload", bnq.g, $$0, gfk::c));
      this.b.add(bnr.a("freeBufferCount", bnq.g, $$0, gfk::d));
      this.b.add(bnr.a("toBatchCount", bnq.g, $$0, gfk::b));
      if (eyn.a().isPresent()) {
         this.b.add(bnr.a("gpuUtilization", bnq.i, feb.Q(), feb::v));
      }
   }

   @Override
   public Set<bnr> a(Supplier<bmi> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
