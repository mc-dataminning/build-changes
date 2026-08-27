import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tn<T> implements ti, tq {
   static final tq a = Stream::empty;
   static final ti b = Stream::empty;
   private final tq c;
   private final ti d;
   private final ec e;
   private final Function<tn<T>, T> f;

   @Override
   public Stream<im> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tn(ec $$0, Function<tn<T>, T> $$1, tq $$2, ti $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ec a() {
      return this.e;
   }

   @Override
   public Stream<to> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tn<T>, T> a;
      private final UnaryOperator<Supplier<Stream<to>>> b;
      private final UnaryOperator<Supplier<Stream<im>>> c;

      public a(Function<tn<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tn<T>, T> $$0, UnaryOperator<Supplier<Stream<to>>> $$1, UnaryOperator<Supplier<Stream<im>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tn.a<T> a(int $$0) {
         return new tn.a<>(this.a, b($$0), b($$0));
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

      private T a(ec $$0, tq $$1, ti $$2) {
         return new tn<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ec> $$0, int $$1) {
         ec $$2 = (ec)$$0.getSource();
         return this.a($$2, tn.a, () -> tk.a($$1, $$2.d(), $$2.e()));
      }

      public T a(CommandContext<ec> $$0) {
         ec $$1 = (ec)$$0.getSource();
         im $$2 = im.a($$1.d());
         return this.a($$1, tn.a, () -> tk.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ec> $$0) {
         ec $$1 = (ec)$$0.getSource();
         im $$2 = im.a($$1.d());
         return this.a($$1, tn.a, () -> tk.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ec> $$0) {
         ec $$1 = (ec)$$0.getSource();
         return this.a($$1, tn.a, () -> tk.a(im.a($$1.d()), $$1.i().K(), $$1.e()));
      }

      public T d(CommandContext<ec> $$0) {
         return this.a((ec)$$0.getSource(), () -> sw.a().stream().filter($$0x -> !$$0x.i()), tn.b);
      }

      public T a(CommandContext<ec> $$0, String $$1) {
         return this.a((ec)$$0.getSource(), () -> sw.a($$1).filter($$0xx -> !$$0xx.i()), tn.b);
      }

      public T a(CommandContext<ec> $$0, boolean $$1) {
         return this.a((ec)$$0.getSource(), () -> sw.c().filter($$1x -> !$$1 || $$1x.h()), tn.b);
      }

      public T b(CommandContext<ec> $$0, String $$1) {
         return this.a((ec)$$0.getSource(), () -> Stream.of(tp.a($$0, $$1)), tn.b);
      }

      public T e(CommandContext<ec> $$0) {
         return this.a($$0, false);
      }
   }
}
