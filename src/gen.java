import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gen implements bnx {
   private final gfe a;
   private final Set<bnv> b = new ObjectOpenHashSet();
   private final bod c = new bod();

   public gen(LongSupplier $$0, gfe $$1) {
      this.a = $$1;
      this.b.add(boe.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(boe.a());
      this.b.add(bnv.a("totalChunks", bnu.f, this.a, gfe::i));
      this.b.add(bnv.a("renderedChunks", bnu.f, this.a, gfe::k));
      this.b.add(bnv.a("lastViewDistance", bnu.f, this.a, gfe::j));
      gig $$0 = this.a.h();
      this.b.add(bnv.a("toUpload", bnu.g, $$0, gig::c));
      this.b.add(bnv.a("freeBufferCount", bnu.g, $$0, gig::d));
      this.b.add(bnv.a("toBatchCount", bnu.g, $$0, gig::b));
      if (fav.a().isPresent()) {
         this.b.add(bnv.a("gpuUtilization", bnu.i, fgj.Q(), fgj::v));
      }
   }

   @Override
   public Set<bnv> a(Supplier<bmm> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
