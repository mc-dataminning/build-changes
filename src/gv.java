import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gv implements ArgumentType<gv.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wy.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final alg h = alg.b("count");
   static final Map<alg, gv.a> i = Stream.of(new gv.a(h, $$0 -> true, cv.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(gv.a::a, $$0 -> (gv.a)$$0));
   static final Map<alg, gv.c> j = Stream.of(new gv.c(h, cv.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(gv.c::a, $$0 -> (gv.c)$$0));
   private final bpv<List<Predicate<cyy>>> k;

   public gv(ee $$0) {
      gv.b $$1 = new gv.b($$0);
      this.k = gq.a($$1);
   }

   public static gv a(ee $$0) {
      return new gv($$0);
   }

   public gv.d a(StringReader $$0) throws CommandSyntaxException {
      return af.a(this.k.a($$0))::test;
   }

   public static gv.d a(CommandContext<ei> $$0, String $$1) {
      return (gv.d)$$0.getArgument($$1, gv.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(alg a, Predicate<cyy> b, Decoder<? extends Predicate<cyy>> c) {

      public static <T> gv.a a(ImmutableStringReader $$0, alg $$1, ki<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw gv.d.createWithContext($$0, $$1);
         } else {
            return new gv.a($$1, $$1x -> $$1x.c($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cyy> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<cyy>> $$2 = this.c.parse($$1);
         return (Predicate<cyy>)$$2.getOrThrow($$1x -> gv.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gq.b<Predicate<cyy>, gv.a, gv.c> {
      private final jg.a a;
      private final jg.b<cyu> b;
      private final jg.b<ki<?>> c;
      private final jg.b<ks.b<?>> d;

      b(jg.a $$0) {
         this.a = $$0;
         this.b = $$0.e(mg.K);
         this.c = $$0.e(mg.r);
         this.d = $$0.e(mg.q);
      }

      public Predicate<cyy> e(ImmutableStringReader $$0, alg $$1) throws CommandSyntaxException {
         je.c<cyu> $$2 = this.b.a(alf.a(mg.K, $$1)).orElseThrow(() -> gv.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cyy> f(ImmutableStringReader $$0, alg $$1) throws CommandSyntaxException {
         ji<cyu> $$2 = this.b.a(axr.a(mg.K, $$1)).orElseThrow(() -> gv.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public gv.a g(ImmutableStringReader $$0, alg $$1) throws CommandSyntaxException {
         gv.a $$2 = gv.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            ki<?> $$3 = this.c.a(alf.a(mg.r, $$1)).map(je::a).orElseThrow(() -> gv.d.createWithContext($$0, $$1));
            return gv.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cyy> a(ImmutableStringReader $$0, gv.a $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, ale.a($$2, this.a));
      }

      public Predicate<cyy> a(ImmutableStringReader $$0, gv.a $$1) {
         return $$1.b;
      }

      public gv.c h(ImmutableStringReader $$0, alg $$1) throws CommandSyntaxException {
         gv.c $$2 = gv.j.get($$1);
         return $$2 != null ? $$2 : this.d.a(alf.a(mg.q, $$1)).map(gv.c::new).orElseThrow(() -> gv.f.createWithContext($$0, $$1));
      }

      public Predicate<cyy> a(ImmutableStringReader $$0, gv.c $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, ale.a($$2, this.a));
      }

      @Override
      public Stream<alg> a() {
         return this.b.c_().map(alf::a);
      }

      @Override
      public Stream<alg> b() {
         return this.b.f().map(axr::b);
      }

      @Override
      public Stream<alg> c() {
         return Stream.concat(gv.i.keySet().stream(), this.c.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<alg> d() {
         return Stream.concat(gv.j.keySet().stream(), this.d.c_().map(alf::a));
      }

      public Predicate<cyy> a(Predicate<cyy> $$0) {
         return $$0.negate();
      }

      public Predicate<cyy> b(List<Predicate<cyy>> $$0) {
         return af.b($$0);
      }
   }

   static record c(alg a, Decoder<? extends Predicate<cyy>> b) {
      public c(je.c<ks.b<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cyy> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<cyy>> $$2 = this.b.parse($$1);
         return (Predicate<cyy>)$$2.getOrThrow($$1x -> gv.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cyy> {
   }
}
