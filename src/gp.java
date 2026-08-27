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

public class gp implements ArgumentType<gp.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final akh h = new akh("count");
   static final Map<akh, gp.a> i = Stream.of(new gp.a(h, $$0 -> true, ct.d.d.map($$0 -> $$1 -> $$0.d($$1.G()))))
      .collect(Collectors.toUnmodifiableMap(gp.a::a, $$0 -> (gp.a)$$0));
   static final Map<akh, gp.c> j = Stream.of(new gp.c(h, ct.d.d.map($$0 -> $$1 -> $$0.d($$1.G()))))
      .collect(Collectors.toUnmodifiableMap(gp.c::a, $$0 -> (gp.c)$$0));
   private final blk<List<Predicate<csz>>> k;

   public gp(dz $$0) {
      gp.b $$1 = new gp.b($$0);
      this.k = gk.a($$1);
   }

   public static gp a(dz $$0) {
      return new gp($$0);
   }

   public gp.d a(StringReader $$0) throws CommandSyntaxException {
      return ac.a(this.k.a($$0))::test;
   }

   public static gp.d a(CommandContext<ed> $$0, String $$1) {
      return (gp.d)$$0.getArgument($$1, gp.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(akh a, Predicate<csz> b, Decoder<? extends Predicate<csz>> c) {

      public static <T> gp.a a(ImmutableStringReader $$0, akh $$1, jz<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw gp.d.createWithContext($$0, $$1);
         } else {
            return new gp.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<csz> a(ImmutableStringReader $$0, akf<ux> $$1, ux $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<csz>> $$3 = this.c.parse($$1, $$2);
         return ac.a((DataResult<Predicate<csz>>)$$3, $$1x -> gp.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gk.b<Predicate<csz>, gp.a, gp.c> {
      private final iy.b<csu> a;
      private final iy.b<jz<?>> b;
      private final iy.b<ci.a<?>> c;
      private final akf<ux> d;

      b(iy.a $$0) {
         this.a = $$0.b(le.G);
         this.b = $$0.b(le.av);
         this.c = $$0.b(le.ax);
         this.d = $$0.a(uo.a);
      }

      public Predicate<csz> e(ImmutableStringReader $$0, akh $$1) throws CommandSyntaxException {
         iw.c<csu> $$2 = this.a.a(akg.a(le.G, $$1)).orElseThrow(() -> gp.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<csz> f(ImmutableStringReader $$0, akh $$1) throws CommandSyntaxException {
         ja<csu> $$2 = this.a.a(awg.a(le.G, $$1)).orElseThrow(() -> gp.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public gp.a g(ImmutableStringReader $$0, akh $$1) throws CommandSyntaxException {
         gp.a $$2 = gp.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            jz<?> $$3 = this.b.a(akg.a(le.av, $$1)).map(iw::a).orElseThrow(() -> gp.d.createWithContext($$0, $$1));
            return gp.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<csz> a(ImmutableStringReader $$0, gp.a $$1, ux $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<csz> a(ImmutableStringReader $$0, gp.a $$1) {
         return $$1.b;
      }

      public gp.c h(ImmutableStringReader $$0, akh $$1) throws CommandSyntaxException {
         gp.c $$2 = gp.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(akg.a(le.ax, $$1)).map(gp.c::new).orElseThrow(() -> gp.f.createWithContext($$0, $$1));
      }

      public Predicate<csz> a(ImmutableStringReader $$0, gp.c $$1, ux $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<akh> a() {
         return this.a.c().map(akg::a);
      }

      @Override
      public Stream<akh> b() {
         return this.a.e().map(awg::b);
      }

      @Override
      public Stream<akh> c() {
         return Stream.concat(gp.i.keySet().stream(), this.b.b().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<akh> d() {
         return Stream.concat(gp.j.keySet().stream(), this.c.c().map(akg::a));
      }

      public Predicate<csz> a(Predicate<csz> $$0) {
         return $$0.negate();
      }

      public Predicate<csz> b(List<Predicate<csz>> $$0) {
         return ac.b($$0);
      }
   }

   static record c(akh a, Decoder<? extends Predicate<csz>> b) {
      public c(iw.c<ci.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<csz> a(ImmutableStringReader $$0, akf<ux> $$1, ux $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<csz>> $$3 = this.b.parse($$1, $$2);
         return ac.a((DataResult<Predicate<csz>>)$$3, $$1x -> gp.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<csz> {
   }
}
