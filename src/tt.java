import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tt<T> implements to, tw {
   static final tw a = Stream::empty;
   static final to b = Stream::empty;
   private final tw c;
   private final to d;
   private final et e;
   private final Function<tt<T>, T> f;

   @Override
   public Stream<je> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tt(et $$0, Function<tt<T>, T> $$1, tw $$2, to $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public et a() {
      return this.e;
   }

   @Override
   public Stream<tu> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tt<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tu>>> b;
      private final UnaryOperator<Supplier<Stream<je>>> c;

      public a(Function<tt<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tt<T>, T> $$0, UnaryOperator<Supplier<Stream<tu>>> $$1, UnaryOperator<Supplier<Stream<je>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tt.a<T> a(int $$0) {
         return new tt.a<>(this.a, b($$0), b($$0));
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

      private T a(et $$0, tw $$1, to $$2) {
         return new tt<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<et> $$0, int $$1) {
         et $$2 = (et)$$0.getSource();
         je $$3 = je.a((jx)$$2.d());
         return this.a($$2, tt.a, () -> tq.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<et> $$0) {
         et $$1 = (et)$$0.getSource();
         je $$2 = je.a((jx)$$1.d());
         return this.a($$1, tt.a, () -> tq.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<et> $$0) {
         et $$1 = (et)$$0.getSource();
         je $$2 = je.a((jx)$$1.d());
         return this.a($$1, tt.a, () -> tq.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<et> $$0) {
         et $$1 = (et)$$0.getSource();
         return this.a($$1, tt.a, () -> tq.a(je.a((jx)$$1.d()), $$1.i().M(), $$1.e()));
      }

      public T d(CommandContext<et> $$0) {
         return this.a((et)$$0.getSource(), () -> tc.a().stream().filter($$0x -> !$$0x.i()), tt.b);
      }

      public T a(CommandContext<et> $$0, String $$1) {
         return this.a((et)$$0.getSource(), () -> tc.a($$1).filter($$0xx -> !$$0xx.i()), tt.b);
      }

      public T a(CommandContext<et> $$0, boolean $$1) {
         return this.a((et)$$0.getSource(), () -> tc.c().filter($$1x -> !$$1 || $$1x.h()), tt.b);
      }

      public T b(CommandContext<et> $$0, String $$1) {
         return this.a((et)$$0.getSource(), () -> Stream.of(tv.a($$0, $$1)), tt.b);
      }

      public T c(CommandContext<et> $$0, String $$1) {
         et $$2 = (et)$$0.getSource();
         je $$3 = je.a((jx)$$2.d());
         return this.a($$2, tt.a, () -> tq.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<et> $$0) {
         return this.a($$0, false);
      }
   }
}
