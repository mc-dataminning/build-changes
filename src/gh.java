import com.google.common.primitives.Doubles;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class gh {
   public static final char a = '@';
   private static final char o = '[';
   private static final char p = ']';
   public static final char b = '=';
   private static final char q = ',';
   public static final char c = '!';
   public static final char d = '#';
   private static final char r = 'p';
   private static final char s = 'a';
   private static final char t = 'r';
   private static final char u = 's';
   private static final char v = 'e';
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vq.c("argument.entity.invalid"));
   public static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> vq.b("argument.entity.selector.unknown", $$0));
   public static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(vq.c("argument.entity.selector.not_allowed"));
   public static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(vq.c("argument.entity.selector.missing"));
   public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(vq.c("argument.entity.options.unterminated"));
   public static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> vq.b("argument.entity.options.valueless", $$0));
   public static final BiConsumer<ens, List<? extends bno>> k = ($$0, $$1) -> $$1.sort(($$1x, $$2) -> Doubles.compare($$1x.f($$0), $$2.f($$0)));
   public static final BiConsumer<ens, List<? extends bno>> l = ($$0, $$1) -> $$1.sort(($$1x, $$2) -> Doubles.compare($$2.f($$0), $$1x.f($$0)));
   public static final BiConsumer<ens, List<? extends bno>> m = ($$0, $$1) -> Collections.shuffle($$1);
   public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> n = ($$0, $$1) -> $$0.buildFuture();
   private final StringReader w;
   private final boolean x;
   private int y;
   private boolean z;
   private boolean A;
   private cm.c B = cm.c.c;
   private cm.d C = cm.d.c;
   @Nullable
   private Double D;
   @Nullable
   private Double E;
   @Nullable
   private Double F;
   @Nullable
   private Double G;
   @Nullable
   private Double H;
   @Nullable
   private Double I;
   private dk J = dk.a;
   private dk K = dk.a;
   private Predicate<bno> L = $$0x -> true;
   private BiConsumer<ens, List<? extends bno>> M = gg.b;
   private boolean N;
   @Nullable
   private String O;
   private int P;
   @Nullable
   private UUID Q;
   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> R = n;
   private boolean S;
   private boolean T;
   private boolean U;
   private boolean V;
   private boolean W;
   private boolean X;
   private boolean Y;
   private boolean Z;
   @Nullable
   private bnu<?> aa;
   private boolean ab;
   private boolean ac;
   private boolean ad;
   private boolean ae;

   public gh(StringReader $$0) {
      this($$0, true);
   }

   public gh(StringReader $$0, boolean $$1) {
      this.w = $$0;
      this.x = $$1;
   }

   public gg a() {
      enn $$2;
      if (this.G == null && this.H == null && this.I == null) {
         if (this.B.b().isPresent()) {
            double $$1 = this.B.b().get();
            $$2 = new enn(-$$1, -$$1, -$$1, $$1 + 1.0, $$1 + 1.0, $$1 + 1.0);
         } else {
            $$2 = null;
         }
      } else {
         $$2 = this.a(this.G == null ? 0.0 : this.G, this.H == null ? 0.0 : this.H, this.I == null ? 0.0 : this.I);
      }

      Function<ens, ens> $$4;
      if (this.D == null && this.E == null && this.F == null) {
         $$4 = $$0 -> $$0;
      } else {
         $$4 = $$0 -> new ens(this.D == null ? $$0.c : this.D, this.E == null ? $$0.d : this.E, this.F == null ? $$0.e : this.F);
      }

      return new gg(this.y, this.z, this.A, this.L, this.B, $$4, $$2, this.M, this.N, this.O, this.Q, this.aa, this.ae);
   }

   private enn a(double $$0, double $$1, double $$2) {
      boolean $$3 = $$0 < 0.0;
      boolean $$4 = $$1 < 0.0;
      boolean $$5 = $$2 < 0.0;
      double $$6 = $$3 ? $$0 : 0.0;
      double $$7 = $$4 ? $$1 : 0.0;
      double $$8 = $$5 ? $$2 : 0.0;
      double $$9 = ($$3 ? 0.0 : $$0) + 1.0;
      double $$10 = ($$4 ? 0.0 : $$1) + 1.0;
      double $$11 = ($$5 ? 0.0 : $$2) + 1.0;
      return new enn($$6, $$7, $$8, $$9, $$10, $$11);
   }

   private void I() {
      if (this.J != dk.a) {
         this.L = this.L.and(this.a(this.J, bno::dE));
      }

      if (this.K != dk.a) {
         this.L = this.L.and(this.a(this.K, bno::dC));
      }

      if (!this.C.c()) {
         this.L = this.L.and($$0 -> !($$0 instanceof aow) ? false : this.C.d(((aow)$$0).cj));
      }
   }

   private Predicate<bno> a(dk $$0, ToDoubleFunction<bno> $$1) {
      double $$2 = (double)awh.g($$0.b() == null ? 0.0F : $$0.b());
      double $$3 = (double)awh.g($$0.c() == null ? 359.0F : $$0.c());
      return $$3x -> {
         double $$4 = awh.d($$1.applyAsDouble($$3x));
         return $$2 > $$3 ? $$4 >= $$2 || $$4 <= $$3 : $$4 >= $$2 && $$4 <= $$3;
      };
   }

   protected void b() throws CommandSyntaxException {
      this.ae = true;
      this.R = this::d;
      if (!this.w.canRead()) {
         throw h.createWithContext(this.w);
      } else {
         int $$0 = this.w.getCursor();
         char $$1 = this.w.read();
         if ($$1 == 'p') {
            this.y = 1;
            this.z = false;
            this.M = k;
            this.a(bnu.bw);
         } else if ($$1 == 'a') {
            this.y = Integer.MAX_VALUE;
            this.z = false;
            this.M = gg.b;
            this.a(bnu.bw);
         } else if ($$1 == 'r') {
            this.y = 1;
            this.z = false;
            this.M = m;
            this.a(bnu.bw);
         } else if ($$1 == 's') {
            this.y = 1;
            this.z = true;
            this.N = true;
         } else {
            if ($$1 != 'e') {
               this.w.setCursor($$0);
               throw f.createWithContext(this.w, "@" + $$1);
            }

            this.y = Integer.MAX_VALUE;
            this.z = true;
            this.M = gg.b;
            this.L = bno::bx;
         }

         this.R = this::e;
         if (this.w.canRead() && this.w.peek() == '[') {
            this.w.skip();
            this.R = this::f;
            this.d();
         }
      }
   }

   protected void c() throws CommandSyntaxException {
      if (this.w.canRead()) {
         this.R = this::c;
      }

      int $$0 = this.w.getCursor();
      String $$1 = this.w.readString();

      try {
         this.Q = UUID.fromString($$1);
         this.z = true;
      } catch (IllegalArgumentException var4) {
         if ($$1.isEmpty() || $$1.length() > 16) {
            this.w.setCursor($$0);
            throw e.createWithContext(this.w);
         }

         this.z = false;
         this.O = $$1;
      }

      this.y = 1;
   }

   protected void d() throws CommandSyntaxException {
      this.R = this::g;
      this.w.skipWhitespace();

      while (this.w.canRead() && this.w.peek() != ']') {
         this.w.skipWhitespace();
         int $$0 = this.w.getCursor();
         String $$1 = this.w.readString();
         gi.a $$2 = gi.a(this, $$1, $$0);
         this.w.skipWhitespace();
         if (!this.w.canRead() || this.w.peek() != '=') {
            this.w.setCursor($$0);
            throw j.createWithContext(this.w, $$1);
         }

         this.w.skip();
         this.w.skipWhitespace();
         this.R = n;
         $$2.handle(this);
         this.w.skipWhitespace();
         this.R = this::h;
         if (this.w.canRead()) {
            if (this.w.peek() != ',') {
               if (this.w.peek() != ']') {
                  throw i.createWithContext(this.w);
               }
               break;
            }

            this.w.skip();
            this.R = this::g;
         }
      }

      if (this.w.canRead()) {
         this.w.skip();
         this.R = n;
      } else {
         throw i.createWithContext(this.w);
      }
   }

   public boolean e() {
      this.w.skipWhitespace();
      if (this.w.canRead() && this.w.peek() == '!') {
         this.w.skip();
         this.w.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public boolean f() {
      this.w.skipWhitespace();
      if (this.w.canRead() && this.w.peek() == '#') {
         this.w.skip();
         this.w.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public StringReader g() {
      return this.w;
   }

   public void a(Predicate<bno> $$0) {
      this.L = this.L.and($$0);
   }

   public void h() {
      this.A = true;
   }

   public cm.c i() {
      return this.B;
   }

   public void a(cm.c $$0) {
      this.B = $$0;
   }

   public cm.d j() {
      return this.C;
   }

   public void a(cm.d $$0) {
      this.C = $$0;
   }

   public dk k() {
      return this.J;
   }

   public void a(dk $$0) {
      this.J = $$0;
   }

   public dk l() {
      return this.K;
   }

   public void b(dk $$0) {
      this.K = $$0;
   }

   @Nullable
   public Double m() {
      return this.D;
   }

   @Nullable
   public Double n() {
      return this.E;
   }

   @Nullable
   public Double o() {
      return this.F;
   }

   public void a(double $$0) {
      this.D = $$0;
   }

   public void b(double $$0) {
      this.E = $$0;
   }

   public void c(double $$0) {
      this.F = $$0;
   }

   public void d(double $$0) {
      this.G = $$0;
   }

   public void e(double $$0) {
      this.H = $$0;
   }

   public void f(double $$0) {
      this.I = $$0;
   }

   @Nullable
   public Double p() {
      return this.G;
   }

   @Nullable
   public Double q() {
      return this.H;
   }

   @Nullable
   public Double r() {
      return this.I;
   }

   public void a(int $$0) {
      this.y = $$0;
   }

   public void a(boolean $$0) {
      this.z = $$0;
   }

   public BiConsumer<ens, List<? extends bno>> s() {
      return this.M;
   }

   public void a(BiConsumer<ens, List<? extends bno>> $$0) {
      this.M = $$0;
   }

   public gg t() throws CommandSyntaxException {
      this.P = this.w.getCursor();
      this.R = this::b;
      if (this.w.canRead() && this.w.peek() == '@') {
         if (!this.x) {
            throw g.createWithContext(this.w);
         }

         this.w.skip();
         this.b();
      } else {
         this.c();
      }

      this.I();
      return this.a();
   }

   private static void a(SuggestionsBuilder $$0) {
      $$0.suggest("@p", vq.c("argument.entity.selector.nearestPlayer"));
      $$0.suggest("@a", vq.c("argument.entity.selector.allPlayers"));
      $$0.suggest("@r", vq.c("argument.entity.selector.randomPlayer"));
      $$0.suggest("@s", vq.c("argument.entity.selector.self"));
      $$0.suggest("@e", vq.c("argument.entity.selector.allEntities"));
   }

   private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$1.accept($$0);
      if (this.x) {
         a($$0);
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      SuggestionsBuilder $$2 = $$0.createOffset(this.P);
      $$1.accept($$2);
      return $$0.add($$2).buildFuture();
   }

   private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      SuggestionsBuilder $$2 = $$0.createOffset($$0.getStart() - 1);
      a($$2);
      $$0.add($$2);
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf('['));
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf(']'));
      gi.a(this, $$0);
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> g(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      gi.a(this, $$0);
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> h(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf(','));
      $$0.suggest(String.valueOf(']'));
      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> i(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      $$0.suggest(String.valueOf('='));
      return $$0.buildFuture();
   }

   public boolean u() {
      return this.N;
   }

   public void a(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> $$0) {
      this.R = $$0;
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, Consumer<SuggestionsBuilder> $$1) {
      return this.R.apply($$0.createOffset(this.w.getCursor()), $$1);
   }

   public boolean v() {
      return this.S;
   }

   public void b(boolean $$0) {
      this.S = $$0;
   }

   public boolean w() {
      return this.T;
   }

   public void c(boolean $$0) {
      this.T = $$0;
   }

   public boolean x() {
      return this.U;
   }

   public void d(boolean $$0) {
      this.U = $$0;
   }

   public boolean y() {
      return this.V;
   }

   public void e(boolean $$0) {
      this.V = $$0;
   }

   public boolean z() {
      return this.W;
   }

   public void f(boolean $$0) {
      this.W = $$0;
   }

   public boolean A() {
      return this.X;
   }

   public void g(boolean $$0) {
      this.X = $$0;
   }

   public boolean B() {
      return this.Y;
   }

   public void h(boolean $$0) {
      this.Y = $$0;
   }

   public boolean C() {
      return this.Z;
   }

   public void i(boolean $$0) {
      this.Z = $$0;
   }

   public void a(bnu<?> $$0) {
      this.aa = $$0;
   }

   public void D() {
      this.ab = true;
   }

   public boolean E() {
      return this.aa != null;
   }

   public boolean F() {
      return this.ab;
   }

   public boolean G() {
      return this.ac;
   }

   public void j(boolean $$0) {
      this.ac = $$0;
   }

   public boolean H() {
      return this.ad;
   }

   public void k(boolean $$0) {
      this.ad = $$0;
   }
}
