import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gkh implements bqv {
   private final glc a;
   private final Set<bqt> b = new ObjectOpenHashSet();
   private final brb c = new brb();

   public gkh(LongSupplier $$0, glc $$1) {
      this.a = $$1;
      this.b.add(brc.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(brc.a());
      this.b.add(bqt.a("totalChunks", bqs.f, this.a, glc::h));
      this.b.add(bqt.a("renderedChunks", bqs.f, this.a, glc::j));
      this.b.add(bqt.a("lastViewDistance", bqs.f, this.a, glc::i));
      got $$0 = this.a.g();
      this.b.add(bqt.a("toUpload", bqs.g, $$0, got::c));
      this.b.add(bqt.a("freeBufferCount", bqs.g, $$0, got::d));
      this.b.add(bqt.a("toBatchCount", bqs.g, $$0, got::b));
      if (fge.a().isPresent()) {
         this.b.add(bqt.a("gpuUtilization", bqs.i, flz.Q(), flz::v));
      }
   }

   @Override
   public Set<bqt> a(Supplier<bpg> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
