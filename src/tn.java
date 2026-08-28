import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tn implements tp, tq {
   static final tp a = Stream::empty;
   static final tq b = Stream::empty;
   private final tp c;
   private final tq d;
   private final ek e;

   @Override
   public Stream<iw> findTestPos() {
      return this.d.findTestPos();
   }

   public static tn.a a() {
      return new tn.a();
   }

   tn(ek $$0, tp $$1, tq $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ek b() {
      return this.e;
   }

   @Override
   public Stream<jg.c<ss>> findTests() {
      return this.c.findTests();
   }

   public static class a {
      private final UnaryOperator<Supplier<Stream<jg.c<ss>>>> a;
      private final UnaryOperator<Supplier<Stream<iw>>> b;

      public a() {
         this.a = $$0 -> $$0;
         this.b = $$0 -> $$0;
      }

      private a(UnaryOperator<Supplier<Stream<jg.c<ss>>>> $$0, UnaryOperator<Supplier<Stream<iw>>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public tn.a a(int $$0) {
         return new tn.a(b($$0), b($$0));
      }

      private static <Q> UnaryOperator<Supplier<Stream<Q>>> b(int $$0) {
         return $$1 -> {
            List<Q> $$2 = new LinkedList<>();
            List<Q> $$3 = ((Stream)$$1.get()).toList();

            for (int $$4 = 0; $$4 < $$0; $$4++) {
               $$2.addAll($$3);
            }

            return $$2::stream;
         };
      }

      private tn a(ek $$0, tp $$1, tq $$2) {
         return new tn($$0, this.a.apply($$1::findTests)::get, this.b.apply($$2::findTestPos)::get);
      }

      public tn a(CommandContext<ek> $$0, int $$1) {
         ek $$2 = (ek)$$0.getSource();
         iw $$3 = iw.a((jq)$$2.d());
         return this.a($$2, tn.a, () -> tj.c($$3, $$1, $$2.e()));
      }

      public tn a(CommandContext<ek> $$0) {
         ek $$1 = (ek)$$0.getSource();
         iw $$2 = iw.a((jq)$$1.d());
         return this.a($$1, tn.a, () -> tj.b($$2, 15, $$1.e()).stream());
      }

      public tn b(CommandContext<ek> $$0) {
         ek $$1 = (ek)$$0.getSource();
         iw $$2 = iw.a((jq)$$1.d());
         return this.a($$1, tn.a, () -> tj.c($$2, 200, $$1.e()));
      }

      public tn c(CommandContext<ek> $$0) {
         ek $$1 = (ek)$$0.getSource();
         return this.a($$1, tn.a, () -> tj.a(iw.a((jq)$$1.d()), $$1.i().K(), $$1.e()));
      }

      public tn a(CommandContext<ek> $$0, boolean $$1) {
         return this.a((ek)$$0.getSource(), () -> sg.a().filter($$1x -> !$$1 || ((ss)$$1x.a()).h()), tn.b);
      }

      public tn a(CommandContext<ek> $$0, Collection<jg.c<ss>> $$1) {
         return this.a((ek)$$0.getSource(), $$1::stream, tn.b);
      }

      public tn d(CommandContext<ek> $$0) {
         return this.a($$0, false);
      }
   }
}
