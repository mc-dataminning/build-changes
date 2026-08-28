import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ub<T> implements tw, ue {
   static final ue a = Stream::empty;
   static final tw b = Stream::empty;
   private final ue c;
   private final tw d;
   private final ew e;
   private final Function<ub<T>, T> f;

   @Override
   public Stream<jh> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   ub(ew $$0, Function<ub<T>, T> $$1, ue $$2, tw $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ew a() {
      return this.e;
   }

   @Override
   public Stream<uc> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<ub<T>, T> a;
      private final UnaryOperator<Supplier<Stream<uc>>> b;
      private final UnaryOperator<Supplier<Stream<jh>>> c;

      public a(Function<ub<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<ub<T>, T> $$0, UnaryOperator<Supplier<Stream<uc>>> $$1, UnaryOperator<Supplier<Stream<jh>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ub.a<T> a(int $$0) {
         return new ub.a<>(this.a, b($$0), b($$0));
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

      private T a(ew $$0, ue $$1, tw $$2) {
         return new ub<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ew> $$0, int $$1) {
         ew $$2 = (ew)$$0.getSource();
         jh $$3 = jh.a((ka)$$2.d());
         return this.a($$2, ub.a, () -> ty.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         jh $$2 = jh.a((ka)$$1.d());
         return this.a($$1, ub.a, () -> ty.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         jh $$2 = jh.a((ka)$$1.d());
         return this.a($$1, ub.a, () -> ty.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         return this.a($$1, ub.a, () -> ty.a(jh.a((ka)$$1.d()), $$1.i().M(), $$1.e()));
      }

      public T d(CommandContext<ew> $$0) {
         return this.a((ew)$$0.getSource(), () -> tk.a().stream().filter($$0x -> !$$0x.i()), ub.b);
      }

      public T a(CommandContext<ew> $$0, String $$1) {
         return this.a((ew)$$0.getSource(), () -> tk.a($$1).filter($$0xx -> !$$0xx.i()), ub.b);
      }

      public T a(CommandContext<ew> $$0, boolean $$1) {
         return this.a((ew)$$0.getSource(), () -> tk.c().filter($$1x -> !$$1 || $$1x.h()), ub.b);
      }

      public T b(CommandContext<ew> $$0, String $$1) {
         return this.a((ew)$$0.getSource(), () -> Stream.of(ud.a($$0, $$1)), ub.b);
      }

      public T c(CommandContext<ew> $$0, String $$1) {
         ew $$2 = (ew)$$0.getSource();
         jh $$3 = jh.a((ka)$$2.d());
         return this.a($$2, ub.a, () -> ty.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<ew> $$0) {
         return this.a($$0, false);
      }
   }
}
