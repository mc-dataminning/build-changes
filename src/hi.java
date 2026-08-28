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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hi implements ArgumentType<hi.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xk.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xk.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xk.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xk.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final alp h = alp.b("count");
   static final Map<alp, hi.a> i = Stream.of(new hi.a(h, $$0 -> true, dj.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(hi.a::a, $$0 -> (hi.a)$$0));
   static final Map<alp, hi.c> j = Stream.of(new hi.c(h, dj.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(hi.c::a, $$0 -> (hi.c)$$0));
   private final bos<List<Predicate<cxg>>> k;

   public hi(es $$0) {
      hi.b $$1 = new hi.b($$0);
      this.k = hd.a($$1);
   }

   public static hi a(es $$0) {
      return new hi($$0);
   }

   public hi.d a(StringReader $$0) throws CommandSyntaxException {
      return ae.a(this.k.a($$0))::test;
   }

   public static hi.d a(CommandContext<ew> $$0, String $$1) {
      return (hi.d)$$0.getArgument($$1, hi.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(alp a, Predicate<cxg> b, Decoder<? extends Predicate<cxg>> c) {

      public static <T> hi.a a(ImmutableStringReader $$0, alp $$1, kt<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hi.d.createWithContext($$0, $$1);
         } else {
            return new hi.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cxg> a(ImmutableStringReader $$0, aln<vj> $$1, vj $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cxg>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cxg>)$$3.getOrThrow($$1x -> hi.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements hd.b<Predicate<cxg>, hi.a, hi.c> {
      private final js.b<cxc> a;
      private final js.b<kt<?>> b;
      private final js.b<cv.a<?>> c;
      private final aln<vj> d;

      b(js.a $$0) {
         this.a = $$0.d(mb.K);
         this.b = $$0.d(mb.az);
         this.c = $$0.d(mb.aB);
         this.d = $$0.a(va.a);
      }

      public Predicate<cxg> e(ImmutableStringReader $$0, alp $$1) throws CommandSyntaxException {
         jq.c<cxc> $$2 = this.a.a(alo.a(mb.K, $$1)).orElseThrow(() -> hi.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cxg> f(ImmutableStringReader $$0, alp $$1) throws CommandSyntaxException {
         ju<cxc> $$2 = this.a.a(aya.a(mb.K, $$1)).orElseThrow(() -> hi.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hi.a g(ImmutableStringReader $$0, alp $$1) throws CommandSyntaxException {
         hi.a $$2 = hi.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kt<?> $$3 = this.b.a(alo.a(mb.az, $$1)).map(jq::a).orElseThrow(() -> hi.d.createWithContext($$0, $$1));
            return hi.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cxg> a(ImmutableStringReader $$0, hi.a $$1, vj $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cxg> a(ImmutableStringReader $$0, hi.a $$1) {
         return $$1.b;
      }

      public hi.c h(ImmutableStringReader $$0, alp $$1) throws CommandSyntaxException {
         hi.c $$2 = hi.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(alo.a(mb.aB, $$1)).map(hi.c::new).orElseThrow(() -> hi.f.createWithContext($$0, $$1));
      }

      public Predicate<cxg> a(ImmutableStringReader $$0, hi.c $$1, vj $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<alp> a() {
         return this.a.c_().map(alo::a);
      }

      @Override
      public Stream<alp> b() {
         return this.a.f().map(aya::b);
      }

      @Override
      public Stream<alp> c() {
         return Stream.concat(hi.i.keySet().stream(), this.b.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<alp> d() {
         return Stream.concat(hi.j.keySet().stream(), this.c.c_().map(alo::a));
      }

      public Predicate<cxg> a(Predicate<cxg> $$0) {
         return $$0.negate();
      }

      public Predicate<cxg> b(List<Predicate<cxg>> $$0) {
         return ae.b($$0);
      }
   }

   static record c(alp a, Decoder<? extends Predicate<cxg>> b) {
      public c(jq.c<cv.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cxg> a(ImmutableStringReader $$0, aln<vj> $$1, vj $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cxg>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cxg>)$$3.getOrThrow($$1x -> hi.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cxg> {
   }
}
