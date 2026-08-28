import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gde implements boa {
   private final gdv a;
   private final Set<bny> b = new ObjectOpenHashSet();
   private final bog c = new bog();

   public gde(LongSupplier $$0, gdv $$1) {
      this.a = $$1;
      this.b.add(boh.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(boh.a());
      this.b.add(bny.a("totalChunks", bnx.f, this.a, gdv::i));
      this.b.add(bny.a("renderedChunks", bnx.f, this.a, gdv::k));
      this.b.add(bny.a("lastViewDistance", bnx.f, this.a, gdv::j));
      ggx $$0 = this.a.h();
      this.b.add(bny.a("toUpload", bnx.g, $$0, ggx::c));
      this.b.add(bny.a("freeBufferCount", bnx.g, $$0, ggx::d));
      this.b.add(bny.a("toBatchCount", bnx.g, $$0, ggx::b));
      if (ezz.a().isPresent()) {
         this.b.add(bny.a("gpuUtilization", bnx.i, ffn.Q(), ffn::v));
      }
   }

   @Override
   public Set<bny> a(Supplier<bmp> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
