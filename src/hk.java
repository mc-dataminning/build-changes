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

public class hk implements ArgumentType<hk.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wv.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wv.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wv.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wv.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final ald h = ald.b("count");
   static final Map<ald, hk.a> i = Stream.of(new hk.a(h, $$0 -> true, dk.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(hk.a::a, $$0 -> (hk.a)$$0));
   static final Map<ald, hk.c> j = Stream.of(new hk.c(h, dk.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(hk.c::a, $$0 -> (hk.c)$$0));
   private final bpk<List<Predicate<cxy>>> k;

   public hk(et $$0) {
      hk.b $$1 = new hk.b($$0);
      this.k = hf.a($$1);
   }

   public static hk a(et $$0) {
      return new hk($$0);
   }

   public hk.d a(StringReader $$0) throws CommandSyntaxException {
      return af.a(this.k.a($$0))::test;
   }

   public static hk.d a(CommandContext<ex> $$0, String $$1) {
      return (hk.d)$$0.getArgument($$1, hk.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(ald a, Predicate<cxy> b, Decoder<? extends Predicate<cxy>> c) {

      public static <T> hk.a a(ImmutableStringReader $$0, ald $$1, kw<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hk.d.createWithContext($$0, $$1);
         } else {
            return new hk.a($$1, $$1x -> $$1x.c($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cxy> a(ImmutableStringReader $$0, alb<ut> $$1, ut $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cxy>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cxy>)$$3.getOrThrow($$1x -> hk.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements hf.b<Predicate<cxy>, hk.a, hk.c> {
      private final ju.b<cxu> a;
      private final ju.b<kw<?>> b;
      private final ju.b<cw.a<?>> c;
      private final alb<ut> d;

      b(ju.a $$0) {
         this.a = $$0.e(me.K);
         this.b = $$0.e(me.az);
         this.c = $$0.e(me.aB);
         this.d = $$0.a(uk.a);
      }

      public Predicate<cxy> e(ImmutableStringReader $$0, ald $$1) throws CommandSyntaxException {
         js.c<cxu> $$2 = this.a.a(alc.a(me.K, $$1)).orElseThrow(() -> hk.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cxy> f(ImmutableStringReader $$0, ald $$1) throws CommandSyntaxException {
         jw<cxu> $$2 = this.a.a(axp.a(me.K, $$1)).orElseThrow(() -> hk.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hk.a g(ImmutableStringReader $$0, ald $$1) throws CommandSyntaxException {
         hk.a $$2 = hk.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kw<?> $$3 = this.b.a(alc.a(me.az, $$1)).map(js::a).orElseThrow(() -> hk.d.createWithContext($$0, $$1));
            return hk.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cxy> a(ImmutableStringReader $$0, hk.a $$1, ut $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cxy> a(ImmutableStringReader $$0, hk.a $$1) {
         return $$1.b;
      }

      public hk.c h(ImmutableStringReader $$0, ald $$1) throws CommandSyntaxException {
         hk.c $$2 = hk.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(alc.a(me.aB, $$1)).map(hk.c::new).orElseThrow(() -> hk.f.createWithContext($$0, $$1));
      }

      public Predicate<cxy> a(ImmutableStringReader $$0, hk.c $$1, ut $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<ald> a() {
         return this.a.c_().map(alc::a);
      }

      @Override
      public Stream<ald> b() {
         return this.a.f().map(axp::b);
      }

      @Override
      public Stream<ald> c() {
         return Stream.concat(hk.i.keySet().stream(), this.b.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<ald> d() {
         return Stream.concat(hk.j.keySet().stream(), this.c.c_().map(alc::a));
      }

      public Predicate<cxy> a(Predicate<cxy> $$0) {
         return $$0.negate();
      }

      public Predicate<cxy> b(List<Predicate<cxy>> $$0) {
         return af.b($$0);
      }
   }

   static record c(ald a, Decoder<? extends Predicate<cxy>> b) {
      public c(js.c<cw.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cxy> a(ImmutableStringReader $$0, alb<ut> $$1, ut $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cxy>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cxy>)$$3.getOrThrow($$1x -> hk.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cxy> {
   }
}
