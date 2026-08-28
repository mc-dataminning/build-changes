import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gcv implements bor {
   private final gdm a;
   private final Set<bop> b = new ObjectOpenHashSet();
   private final box c = new box();

   public gcv(LongSupplier $$0, gdm $$1) {
      this.a = $$1;
      this.b.add(boy.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(boy.a());
      this.b.add(bop.a("totalChunks", boo.f, this.a, gdm::i));
      this.b.add(bop.a("renderedChunks", boo.f, this.a, gdm::k));
      this.b.add(bop.a("lastViewDistance", boo.f, this.a, gdm::j));
      ggo $$0 = this.a.h();
      this.b.add(bop.a("toUpload", boo.g, $$0, ggo::c));
      this.b.add(bop.a("freeBufferCount", boo.g, $$0, ggo::d));
      this.b.add(bop.a("toBatchCount", boo.g, $$0, ggo::b));
      if (ezr.a().isPresent()) {
         this.b.add(bop.a("gpuUtilization", boo.i, fff.Q(), fff::v));
      }
   }

   @Override
   public Set<bop> a(Supplier<bng> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
