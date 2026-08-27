import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ta(tb j, tb k) {
   public static final Codec<ta> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(tb.a.fieldOf("chat").forGetter(ta::a), tb.a.fieldOf("narration").forGetter(ta::b)).apply($$0, ta::new)
   );
   public static final tb b = tb.a("chat.type.text");
   public static final aeo<ta> c = a("chat");
   public static final aeo<ta> d = a("say_command");
   public static final aeo<ta> e = a("msg_command_incoming");
   public static final aeo<ta> f = a("msg_command_outgoing");
   public static final aeo<ta> g = a("team_msg_command_incoming");
   public static final aeo<ta> h = a("team_msg_command_outgoing");
   public static final aeo<ta> i = a("emote_command");

   private static aeo<ta> a(String $$0) {
      return aeo.a(jd.aq, new aep($$0));
   }

   public static void a(nn<ta> $$0) {
      $$0.a(c, new ta(b, tb.a("chat.type.text.narrate")));
      $$0.a(d, new ta(tb.a("chat.type.announcement"), tb.a("chat.type.text.narrate")));
      $$0.a(e, new ta(tb.b("commands.message.display.incoming"), tb.a("chat.type.text.narrate")));
      $$0.a(f, new ta(tb.c("commands.message.display.outgoing"), tb.a("chat.type.text.narrate")));
      $$0.a(g, new ta(tb.d("chat.type.team.text"), tb.a("chat.type.text.narrate")));
      $$0.a(h, new ta(tb.d("chat.type.team.sent"), tb.a("chat.type.text.narrate")));
      $$0.a(i, new ta(tb.a("chat.type.emote"), tb.a("chat.type.emote")));
   }

   public static ta.a a(aeo<ta> $$0, big $$1) {
      return a($$0, $$1.dK().B_(), $$1.H_());
   }

   public static ta.a a(aeo<ta> $$0, ds $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static ta.a a(aeo<ta> $$0, ht $$1, te $$2) {
      hs<ta> $$3 = $$1.d(jd.aq);
      return $$3.e($$0).a($$2);
   }

   public ta.a a(te $$0) {
      return new ta.a(this, $$0);
   }

   public tb a() {
      return this.j;
   }

   public tb b() {
      return this.k;
   }

   public static record a(ta a, te b, @Nullable te c) {
      a(ta $$0, te $$1) {
         this($$0, $$1, null);
      }

      public te a(te $$0) {
         return this.a.a().a($$0, this);
      }

      public te b(te $$0) {
         return this.a.b().a($$0, this);
      }

      public ta.a c(te $$0) {
         return new ta.a(this.a, this.b, $$0);
      }

      public ta.b a(ht $$0) {
         hs<ta> $$1 = $$0.d(jd.aq);
         return new ta.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, te b, @Nullable te c) {
      public b(sh $$0) {
         this($$0.m(), $$0.l(), $$0.c(sh::l));
      }

      public void a(sh $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, sh::a);
      }

      public Optional<ta.a> a(ht $$0) {
         hs<ta> $$1 = $$0.d(jd.aq);
         ta $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new ta.a($$0x, this.b, this.c));
      }
   }
}
