import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gdm implements boe {
   private final ged a;
   private final Set<boc> b = new ObjectOpenHashSet();
   private final bok c = new bok();

   public gdm(LongSupplier $$0, ged $$1) {
      this.a = $$1;
      this.b.add(bol.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bol.a());
      this.b.add(boc.a("totalChunks", bob.f, this.a, ged::i));
      this.b.add(boc.a("renderedChunks", bob.f, this.a, ged::k));
      this.b.add(boc.a("lastViewDistance", bob.f, this.a, ged::j));
      ghf $$0 = this.a.h();
      this.b.add(boc.a("toUpload", bob.g, $$0, ghf::c));
      this.b.add(boc.a("freeBufferCount", bob.g, $$0, ghf::d));
      this.b.add(boc.a("toBatchCount", bob.g, $$0, ghf::b));
      if (fah.a().isPresent()) {
         this.b.add(boc.a("gpuUtilization", bob.i, ffw.Q(), ffw::v));
      }
   }

   @Override
   public Set<boc> a(Supplier<bmt> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
