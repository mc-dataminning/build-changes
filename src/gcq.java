import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gcq implements bom {
   private final gdh a;
   private final Set<bok> b = new ObjectOpenHashSet();
   private final bos c = new bos();

   public gcq(LongSupplier $$0, gdh $$1) {
      this.a = $$1;
      this.b.add(bot.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bot.a());
      this.b.add(bok.a("totalChunks", boj.f, this.a, gdh::i));
      this.b.add(bok.a("renderedChunks", boj.f, this.a, gdh::k));
      this.b.add(bok.a("lastViewDistance", boj.f, this.a, gdh::j));
      ggj $$0 = this.a.h();
      this.b.add(bok.a("toUpload", boj.g, $$0, ggj::c));
      this.b.add(bok.a("freeBufferCount", boj.g, $$0, ggj::d));
      this.b.add(bok.a("toBatchCount", boj.g, $$0, ggj::b));
      if (ezm.a().isPresent()) {
         this.b.add(bok.a("gpuUtilization", boj.i, ffa.Q(), ffa::v));
      }
   }

   @Override
   public Set<bok> a(Supplier<bnb> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
