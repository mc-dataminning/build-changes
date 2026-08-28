import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gkm implements bre {
   private final glh a;
   private final Set<brc> b = new ObjectOpenHashSet();
   private final brk c = new brk();

   public gkm(LongSupplier $$0, glh $$1) {
      this.a = $$1;
      this.b.add(brl.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(brl.a());
      this.b.add(brc.a("totalChunks", brb.f, this.a, glh::h));
      this.b.add(brc.a("renderedChunks", brb.f, this.a, glh::j));
      this.b.add(brc.a("lastViewDistance", brb.f, this.a, glh::i));
      goy $$0 = this.a.g();
      this.b.add(brc.a("toUpload", brb.g, $$0, goy::c));
      this.b.add(brc.a("freeBufferCount", brb.g, $$0, goy::d));
      this.b.add(brc.a("toBatchCount", brb.g, $$0, goy::b));
      if (fgl.a().isPresent()) {
         this.b.add(brc.a("gpuUtilization", brb.i, fmg.Q(), fmg::v));
      }
   }

   @Override
   public Set<brc> a(Supplier<bpq> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
