import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ub(ug d, @Nullable tx e, ue f, @Nullable tm g, tp h) {
   public static final MapCodec<ub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ug.a.fieldOf("link").forGetter(ub::j),
               tx.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               ue.a.forGetter(ub::l),
               arg.b.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               tp.a.optionalFieldOf("filter_mask", tp.c).forGetter(ub::n)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ub($$0x, (tx)$$1.orElse(null), $$2, (tm)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static ub a(String $$0) {
      return a(i, $$0);
   }

   public static ub a(UUID $$0, String $$1) {
      ue $$2 = ue.a($$1);
      ug $$3 = ug.a($$0);
      return new ub($$3, null, $$2, null, tp.c);
   }

   public ub a(tm $$0) {
      tm $$1 = !$$0.equals(tm.b(this.b())) ? $$0 : null;
      return new ub(this.d, this.e, this.f, $$1, this.h);
   }

   public ub a() {
      return this.g != null ? new ub(this.d, this.e, this.f, null, this.h) : this;
   }

   public ub a(tp $$0) {
      return this.h.equals($$0) ? this : new ub(this.d, this.e, this.f, this.g, $$0);
   }

   public ub a(boolean $$0) {
      return this.a($$0 ? this.h : tp.c);
   }

   public static void a(asg.a $$0, ug $$1, ue $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(ash $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String b() {
      return this.f.a();
   }

   public tm c() {
      return Objects.requireNonNullElseGet(this.g, () -> tm.b(this.b()));
   }

   public Instant d() {
      return this.f.b();
   }

   public long e() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.d().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.d().plus(c));
   }

   public UUID f() {
      return this.d.c();
   }

   public boolean g() {
      return this.f().equals(i);
   }

   public boolean h() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.h() && this.d.c().equals($$0);
   }

   public boolean i() {
      return this.h.b();
   }

   public ug j() {
      return this.d;
   }

   @Nullable
   public tx k() {
      return this.e;
   }

   public ue l() {
      return this.f;
   }

   @Nullable
   public tm m() {
      return this.g;
   }

   public tp n() {
      return this.h;
   }
}
